package Java.Training.Practice.Day23;

public class GenericClassPractice {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String, Integer>("name", 200);

        Pair pair1 = new Pair("name", "Sumit");

        Pair<Integer,Integer> pair2 = new Pair<>(1,100);

        Pair<Float, Float> pair3 = new Pair<>(1.00f,100.00f);

        Pair<String,Integer > pair4 = new Pair<>("Hello", 1);

        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);



    }
}
