package test;

import java.util.*;


public class TestScanner {
    public static void  main(String args[]) {
        ArrayList<Integer> sScore = new ArrayList<Integer>(); //for the student_4 marks
        String name, id;
        String s = "Hello, this is a test!";

        Scanner scan = new Scanner(s); //Create scanner object ‘scan’ and passes string ‘s’
        System.out.println("String: " + scan.nextLine());  //Prints the string
        scan.close();

        System.out.println("--- Enter your details from the keyboard --- ");


        Scanner in = new Scanner(System.in);   //will read from the keyboard
        System.out.print("Enter your name: ");
        name = in.nextLine();


        System.out.println("Name: " + name);
        System.out.print("Enter your student number: ");
        id = in.next();

        System.out.println("St number: " + id);
        System.out.println("Enter marks separated with whitespace!");
        System.out.println("Use ' ;' after the last one and press 'Return'): ");
        while (in.hasNextInt()) {   //Check if this scanner has another token in its input
            int mark = in.nextInt();   // scans the next token as an int
            sScore.add(mark);      	// adds the mark to the arraylist
        }
        System.out.println("Marks: ");
        for (int i = 0; i < sScore.size(); i++) {
            System.out.println("sScore[" + i + "]:" + sScore.get(i));
        }
        in.close();
    }
}
