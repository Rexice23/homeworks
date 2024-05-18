package otus.java.basic.oop4;

public interface Transport {

    String getType();

    boolean move(int distance, Terrain terrain);
}
