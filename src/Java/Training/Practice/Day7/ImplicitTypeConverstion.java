package Java.Training.Practice.Day7;

public class ImplicitTypeConverstion {
    public static void main(String[] args) {
        int i = 10;
        long l= i;
        float f = l;

//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);

        char ch1 = 'A';
        double d1 = ch1;
        System.out.println(ch1 * ch1);

        String st = "Hello ";
        System.out.println(st + 65);

        int in = (int) (i + f); //explicit type of conversion to convert higher value to lower valued data




    }




}
