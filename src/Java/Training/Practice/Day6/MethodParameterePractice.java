package Java.Training.Practice.Day6;

public class MethodParameterePractice {

    public static void main(String[] args) {
        int a = 10;

        MethodParameterePractice methodParameterePractice = new MethodParameterePractice();
        methodParameterePractice.printNumber(a);
        System.out.println(a);


    }

    public void printNumber(int a) {
//        System.out.println(printNumber(a));
        a = 15;

    }


}
