package Java.Training.Practice.Day21;

public class OuterClass {

    public class InnerClass {

        public void show(){
            System.out.println("Inside innerclass.");
        }

    }
    public InnerClass createObjectOfInnerClass(){
        InnerClass innerClass = new InnerClass();
        return innerClass;
    }
}
