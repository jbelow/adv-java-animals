package us.mattgreen;

import java.util.Scanner;

public class Create {

    Scanner keyboard = new Scanner(System.in);
    private int type;

    public Create(int type) {
        this.type = type;
    }


    public Talkable createMethod (){



//        zoo.add(new Dog(true, "Bean"));
//        zoo.add(new Cat(9, "Charlie"));
//        zoo.add(new Teacher(44, "Stacy Read"));


            if (type == 1) {

                int mousesKilled;
                String catName;

                System.out.println("How many mouse kills does that cat have?");
                mousesKilled = Integer.parseInt(keyboard.nextLine());
//                    keyboard.nextLine();

                System.out.println("What is the cat's name?");
                catName = keyboard.nextLine();
                System.out.println("testing");

                Cat cat = new Cat(mousesKilled, catName);

                return cat;

            } else if (type == 2) {
                String userInput;
                boolean friendly;
                String doggoName;

                System.out.println("Is the dog friendly? YES : NO");
                userInput = keyboard.nextLine();
                if (userInput.toUpperCase().equals("YES")) {
                    friendly = true;
                } else {
                    friendly = false;
                }
                System.out.println("What is the dog's name?");
                doggoName = keyboard.nextLine();

                Dog dog = new Dog(friendly, doggoName);

                return dog;

            } else if (type == 3) {
                int teacherAge;
                String teacherName;

                System.out.println("How old is the teacher?");
                teacherAge = Integer.parseInt(keyboard.nextLine());
//                    keyboard.nextInt();

                System.out.println("What is the teacher's name?");
                teacherName = keyboard.nextLine();

                Teacher teacher = new Teacher(teacherAge, teacherName);

                return teacher;

            } else {
                System.out.println("ERROR: Program got wrong input\nYou didn't enter 1-3");
                return null;
            }

    }
}
