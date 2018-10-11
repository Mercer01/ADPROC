package student;


public class Main {
    public static void main(String[] args) {
        String myString;

        int[] sScore1 = {40, 60, 50};
        int[] sScore2 = {70, 50, 50};
        int[] sScore3 = new int[3];
        for (int i = 0; i < 3; i++) {    // assign random exam marks between 0 and 100
            sScore3[i] = (int) (Math.random() * 100); //Mat.random() returns double between 0 and 1
        }

        String s2Name = "Augusta Ada", s2ID = "0123aa";

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1); // first object
        Student stud2 = new Student(s2Name, s2ID, sScore2);  // second object
        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);  // third object
 
        stud1.printOut();             // print out the object information
        stud2.printOut();
        stud3.printOut();

        Course cm = new Course("Computing", "CMP06");    // first instance of class Course
        Course cs = new Course("Computer Science", "CS06");    // second insxtance of class Course

        cm.addStudent(stud1);    //add two students to this course
        cm.addStudent(stud2);

        double cmAverage = cm.averageSc();    //calculate the course average score
        int cmNumbers = cm.getNumStud();
        int csNumbers = cs.getNumStud();


        System.out.println("\ncourse name: " + cm.getName());
        System.out.println("\t average = " + cmAverage);
        System.out.println("\t stud number = " + cmNumbers);

        for (int i = 0; i < cmNumbers; i++) {
            System.out.println("\t Student" + i +":" + cm.list[i].getName());
        }

        cs.addStudent(stud3);// add a student
        System.out.println("\n course name: "+ cs.getName());
        System.out.println("\t average =  = "+ cs.averageSc());
        System.out.print("\t stud number = "+ cs.getNumStud());

        for (int i = 0; i < csNumbers; i++) {
          System.out.println("\t Student" + i + ":" + cs.list[i].getName());
        }
    }
}
