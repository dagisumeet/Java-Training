package Java.Training.Practice.Day1;

public class CatsPractice {
    public static void main(String[] args) {
        Cat thor = new Cat();
        thor.name = "Thor";
        thor.age = 2;
        thor.color = "white";
        thor.weight = 2.5f;


        Cat rambo = new Cat();
        rambo.name = "rambo";
        rambo.age = 3;
        rambo.color = "Black";
        rambo.weight= 3.5f;

        String thorName = thor.name;
        System.out.println(thorName);

        int thorAge = thor.age;
        System.out.println(thorAge);

        String thorColror = thor.color;
        System.out.println(thorColror);

        float thorWeight = thor.weight;
        System.out.println(thorWeight);

        String ramboName=rambo.name;
        System.out.println(ramboName);

        int ramboAge= rambo.age;
        System.out.println(ramboAge);

        String ramboColor=rambo.color;
        System.out.println(ramboColor);

        float ramboWeight=rambo.weight;
        System.out.println(ramboWeight);

        thor.sleep();
        rambo.play();
        rambo.meow();
        thor.meow();


    }

}

