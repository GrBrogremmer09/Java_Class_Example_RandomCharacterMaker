package classestest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class ClassesTest {

    public static void main(String[] args) {

        Character character = new Character();
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the name of the student: ");
        String nameOfStudent = scan.nextLine();

        System.out.println("Write the last name of the student: ");
        String LastName = scan.nextLine();

        System.out.println("Write the age of the student: ");
        int age = scan.nextInt();

        System.out.println("Write the weight of the student: ");
        int weight = scan.nextInt();

        System.out.println("Write the height of the student: ");
        double height = scan.nextDouble();

        try {
            File myObj = new File("C:\\" + nameOfStudent + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("C:\\" + nameOfStudent + ".txt");
            myWriter.write(nameOfStudent + LastName + height + weight + age);
            myWriter.close();
            System.out.println("Successfully wrote to the file." );
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
