package Java.Training.Practice.Day1;

public class CatsPractice {
    public static void main(String[] args) {
        Cat thor = new Cat();
        //thor.name = "Thor";
        //thor.age = 2;
        //thor.color = "white";
        //thor.weight = 2.5f;
        thor.setName("Thor");
        thor.setAge (2);
        thor.setWeight(2.5f);
        thor.setColor("white");



        Cat rambo = new Cat();
        //rambo.name = "rambo";
        //rambo.age = 3;
        //rambo.color = "Black";
        //rambo.weight= 3.5f;

        rambo.setName("Rambo");
        rambo.setAge(3);
        rambo.setWeight(3.5f);
        rambo.setColor("Black");


        //String thorName = thor.name;
        String thorName = thor.getName();
        System.out.println(thorName);

        //int thorAge = thor.age;
        int thorAge = thor.getAge();
        System.out.println(thorAge);

        //String thorColror = thor.color;
        String thorColror = thor.getColor();
        System.out.println(thorColror);

        //float thorWeight = thor.weight;
        float thorWeight = thor.getWeight();
        System.out.println(thorWeight);

       // String ramboName=rambo.name;
        String ramboName=rambo.getName();
        System.out.println(ramboName);

        //int ramboAge= rambo.age;
        int ramboAge= rambo.getAge();
        System.out.println(ramboAge);

        //String ramboColor=rambo.color;
        String ramboColor=rambo.getColor();
        System.out.println(ramboColor);

        //float ramboWeight=rambo.weight;
        float ramboWeight=rambo.getWeight();
        System.out.println(ramboWeight);

        thor.sleep();
        rambo.play();
        rambo.meow();
        thor.meow();


    }

}

