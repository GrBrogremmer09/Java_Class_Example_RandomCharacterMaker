package classestest;

public class Character {

    int height, weight, age;
    String[] name;
    String[] lastName;
    int Name, LastName;

    public int randNum(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public int age() {
        int age = randNum(0, 100);
        return age;
    }

    public int height() {
        int height = randNum(100, 250);
        return height;
    }

    public int weight() {
        int max = 160;
        int min = 60;
        int range = max - min + 1;
        weight = (int) (Math.random() * range) + min;
        return weight;
    }

    public int name() {
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        Name = (int) (Math.random() * range) + min;
        return Name;
    }

    public int LastName() {
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        LastName = (int) (Math.random() * range) + min;
        return LastName;
    }

    Character() {
        String[] name = {"George", "Aggelos", "Apollonas", "Orfeas", "Haris"};
        String[] lastName = {"Raftopoulos", "Theodoridis", "Papadopoulos", "Dun", "Mitsopoulous"};
        //
        System.out.println("Your name is: " + name[name()]);
        System.out.println("Your last name is: " + lastName[LastName()]);
        System.out.println("Your weiht is: " + weight());
        System.out.println("Your heiht is: " + height());
        System.out.println("Your age is: " + age());

    }

}
