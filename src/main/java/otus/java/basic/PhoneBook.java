package otus.java.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> contact;

    public PhoneBook() {
        contact = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Телефонный справочник \n" +
                "Контакты: " + contact;
    }

    public void add(String name, String phoneNumber) {
        Set<String> numbers = contact.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            contact.put(name, numbers);
        }
        numbers.add(phoneNumber);
    }

    public Set<String> find(String name) {
        Set<String> numbers = contact.get(name);
        if (numbers != null) return numbers;
        return new HashSet<>();
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> numbers : contact.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}

