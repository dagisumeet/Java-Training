package Java.Training.Practice.Day23;

public class GenericMethodPractice {
    public static void main(String[] args) {
        Integer[] values = {2,3,5,7,9};
        String [] sValues ={"Hello", "Mr.", "How", "Do"};
        Float [] fValues ={22f,3f,50f,71f,92f};

        printArray(values);
        printArray(sValues);
        printArray(fValues);

    }
// This is called with integer and float array.
    public static <T extends Number> void printArray(T[] values){

        for( T val: values) {
            System.out.println(val);
        }
        System.out.println("It is of type number");
    }
// This is called with string array.
        public static void printArray(String[] values){

            for( String val: values) {
                System.out.println(val);
            }

    }
//    public static void printArray(Float[] values){
//
//        for( Float val: values) {
//            System.out.println(val);
//        }
//
//    }

    // In the first example the .compareTo method isn't bounded with anything so it won't work with the class without comparable method and may create problem.
//    public static <T> T maximum(T x, T y, T z) {
//        T max = x; // assume x is initially the largest
//        if (y.compareTo(max) > 0) {
//            max = y; // y is the largest so far
//        }
//        if (z.compareTo(max) > 0) {
//            max = z; // z is the largest now
//        }
//        return max; // returns the largest object
//    }


    // In the below example the T element is extents to Comparable that is bounded with comparable. In this case, it will work with comparable and it doesn't have comparable it won't give any problem.

//    public static <T> T maximum(T x, T y, T z) {
//        T max = x; // assume x is initially the largest
//        if (y.compareTo(max) > 0) {
//            max = y; // y is the largest so far
//        }
//        if (z.compareTo(max) > 0) {
//            max = z; // z is the largest now
//        }
//        return max; // returns the largest object
//    }

    // Here in the below problem the above problem is by extending the T value with comparable. It is called bounded generic.
    public static <T extends Comparable> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }



}
