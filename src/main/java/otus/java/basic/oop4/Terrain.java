package otus.java.basic.oop4;

public enum Terrain {
    DENSE_FOREST("густому лесу"),
    PLAIN("равнине"),
    SWAMP("болоту");

    private final String name;

    Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
