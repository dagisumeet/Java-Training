package Java.Training.Practice.Day1;

public class ClassPlastic {
     public static void main(String[] args) {
         Cat thor = new Cat();
         thor.name = "Thor";
         thor.age = 2;
         thor.color = "white";
         thor.weight = 2.5f;



         Cat ranbow = new Cat();
         ranbow.name = "Ranbow";
         ranbow.age = 3;
         ranbow.color = "Black";
         ranbow.weight= 3.5f;

         String thorName = thor.name;
         System.out.println(thorName);
         int thorAge = thor.age;
         System.out.println(thorAge);

         String thorColror = thor.color;
         System.out.println(thorColror);


     }

}
