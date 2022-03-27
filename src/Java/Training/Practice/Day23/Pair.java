package Java.Training.Practice.Day23;

import java.security.Key;

public class Pair <T,S> {

    private T key;
    private S value;

    public Pair(T key, S value) {
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }
    public S getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
