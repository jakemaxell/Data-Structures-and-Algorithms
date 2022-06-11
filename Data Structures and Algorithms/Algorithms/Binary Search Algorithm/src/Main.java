// Binary Search Tree Algorithm
// 6/10/2022

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String[] firstNames = {"Alex", "Bailey", "Cory", "Danielle", "Evan", "Franklin", "Gina", "Hector", "Janet"};
        String[] lastNames = {"Ferris", "Gibbins", "Heffer", "Ingram", "Jonas", "Almeto", "Bourne", "Cooper", "Day"};
        String[] majors = {"Accounting", "Biology", "Computer Science", "Dentistry", "Economics", "Finance", "History", "Information Technology", "Journalism"};
        int[] ages = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        double[] gpas = {1.0, 1.3, 1.5, 1.8, 2.0, 2.3, 2.5, 2.8, 3.0, 3.3, 3.5, 3.8, 4.0};

        ArrayList<String> IDs = new ArrayList<>();

        Student rootStudent = new Student("Jacob", "Maxwell", "Physics", 24, 3.5);

        Node node = new Node(rootStudent);
        BinaryTree binaryTree = new BinaryTree();

        for(int x = 0; x < 500; x++){
            Random random = new Random();

            Student newStudent = new Student(firstNames[random.nextInt(firstNames.length)], lastNames[random.nextInt(lastNames.length)], majors[random.nextInt(majors.length)], ages[random.nextInt(ages.length)], gpas[random.nextInt(gpas.length)]);
            IDs.add(newStudent.getID());

            binaryTree.insert(node, newStudent);
        }

        while(true) {
            int counter = 0;
            for(int x = 0; x < IDs.size(); x++){
                if(counter < 30){
                    System.out.print(IDs.get(x) + " ");
                    counter += 1;
                    continue;
                }
                counter = 0;
                System.out.println();
            }

            System.out.println();

            Scanner input = new Scanner(System.in);

            int choice = 0;
            try {
                System.out.println("1. Look up student by ID.");
                System.out.println("2. Add a student.");
                System.out.print("What would you like to do?: ");
                choice = input.nextInt();
            }catch(Exception e){
                System.out.println(e);
            }

            if(choice == 1){
                input.nextLine();
                System.out.print("What student would you like to look up?: ");

                String studentSearch = input.nextLine();
                binaryTree.search(node, studentSearch);
            }
            else if(choice == 2){
                input.nextLine();

                System.out.print("Please enter the student's first name: ");
                String first = input.next();

                System.out.print("Please enter the student's last name: ");
                String last = input.next();

                input.nextLine();

                System.out.print("Please enter the student's major: ");
                String mj = input.nextLine();

                System.out.print("Please enter the student's gpa: ");
                double gpa = input.nextDouble();

                System.out.print("Please enter the student's age: ");
                int ag = input.nextInt();

                Student newStudent = new Student(first, last, mj, ag, gpa);
                binaryTree.insert(node, newStudent);

                System.out.println("New Student ID: " + newStudent.getID());
                IDs.add(newStudent.getID());
            }
            else{
                System.out.println("Invalid input. . .");
            }

            System.out.println();
            System.out.print("Press 'ENTER' to continue. . .");
            pause();
        }
    }

    public static void pause(){
        try{
            System.in.read();
        } catch(Exception e){

        }
    }
}
