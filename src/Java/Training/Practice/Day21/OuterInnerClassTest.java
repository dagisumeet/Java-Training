package Java.Training.Practice.Day21;

public class OuterInnerClassTest {
    public static void main(String[] args) {
      OuterClass outerClass = new OuterClass();

      OuterClass.InnerClass innerClass = outerClass.new InnerClass();
      innerClass.show();

      outerClass.createObjectOfInnerClass().show();


    }

}
