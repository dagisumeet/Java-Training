package Java.Training.Practice.Day18;

public class VariablesNumberOfParameters {
    public static void main(String[] args) {

       // We can add as many as elements in the below parameters. Ellipse method will make us able to operate this way. Ellipse is written "..." this way.

        String myDetials= String.format("My name is %s and my age is %d.", "Sumit Dagi", 38);

        System.out.println(myDetials);

        add(5, 6 ,12);
        add(8, 5,4,9);
            }
//
//            public static void add(int a, int b){
//
//                int c = a + b;
//
//                System.out.println(c);
//            }
//
//            public static void add(int a, int b, int c) {
//
//                int temp = a + b + c;
//
//                System.out.println(temp);
//            }

            /* In the method above we can pass the limited values to those methods  because we are limited by the variable we have used.
            * we can avoid this using Ellipse as below.*/

        public  static void add(int...numbers) {
            int temp = 0;
            for (int number :numbers) {
                temp += number;
                System.out.print(number);
                System.out.print(",");

            }

            System.out.println("");
            System.out.println(temp);

//    This is also a kind of array. Here in this example "numbers" variables are array because it contains list of elements.
        }

}
