package us.mattgreen;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        // Lines to Replace Begin Here

        int type;
        int loopTimes;



        System.out.println("how many animals do you want:");
        loopTimes = keyboard.nextInt();

        for (int i = 0; i < loopTimes; i++){
            System.out.println("What kind of animal do you want to create: \n 1) Cat \n 2) Dog \n 3) Person");
            type = keyboard.nextInt();
            Create userCreate = new Create(type);
            zoo.add(userCreate.createMethod());
        }



//        zoo.add(new Dog(true, "Bean"));
//        zoo.add(new Cat(9, "Charlie"));
        zoo.add(new Teacher(44, "Stacy Read"));
        // End Lines to Replace

        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
