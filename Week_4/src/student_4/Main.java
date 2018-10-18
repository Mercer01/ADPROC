
package student_4;

import java.io.*;   	// you need this for the I/O
import java.util.*;  	// you need this for the Scanner class

public class Main {

    static Scanner console = new Scanner(System.in);  //object of Scanner class

    public static void main(String[] args) throws IOException {
        String sName, again;
        ArrayList<Student> stud = new ArrayList<Student>();
        int i, num = 0;
        boolean answer;
        int[] sMarks = new int[3];
        do {
            System.out.println("\n Enter student first and last name, separated by space.");
            sName = console.nextLine();   //returns (the rest of) the current input line
            System.out.println("Enter three marks separated with whitespace!");
            for (i = 0; i < sMarks.length; i++) {
                sMarks[i] = console.nextInt();  	// scans the next token as an int
            }
            console.nextLine(); 		 // to clear the rest of the current line
            // create an object of class Student
            Student current = new Student(sName, sMarks);
            stud.add(current);
            System.out.println("\n Another student (y/n)?");
            again = console.nextLine();         // this will get your answer to the above query
            answer = false;    		// Boolean variable for the interactive input
            if (again.charAt(0) == 'y') {
                answer = true; 	 	// if data for another student is going to be entered
                num++;   		// increase the number of students
            }
        } while (answer);

        Course cm = new Course("Computing", "CMP06");    // cm - first instance of class Course
        for (i = 0; i < num / 2; i++) {
            cm.addStudent(stud.get(i));
        }
        double cmAver = cm.averageSc();    // get the average score for cm
        int cmNumbers = cm.getNumStud();  // get the number of students in cm

        System.out.println("\ncourse name: " + cm.getName());  // outputs course name
        System.out.println("\t course average = " + cmAver);     // outputs course average score
        System.out.println("\t number of stud = " + cmNumbers); // number of students in the course
        for (i = 0; i < cmNumbers; i++) {
            cm.getList()[i].printOut();   // outputs the students’ info
            System.out.println("\t average score:" + cm.getList()[i].avScore());
        }
        Course cs = new Course("Computer Science", "CS06"); // cs - second instance of class Course
        for (i = num / 2; i < num; i++) // second half of the students will be added to cs
        {
            cs.addStudent(stud.get(i));
        }
        System.out.println("\n course name: " + cs.getName());
        System.out.println("\t average:" + cs.averageSc());
        System.out.println("\t number of students:" + cs.getNumStud());
    }
}
