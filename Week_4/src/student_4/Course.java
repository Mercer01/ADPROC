package student_4;

public class Course{
    private String name, code;
    private int numStudents = 0;
    Student[] list = new Student[10];


    public Course(){}

    Course(String nm,String cd){
        name=nm;
        code=cd;
    }
    void addStudent(Student st){    //needs check first whether the list is full
        list[numStudents]=st;
        numStudents+=1;
    }

    double averageSc(){
        double sum=0.0;
        for(int i=0;i<numStudents; i++)
            sum+=list[i].avScore();
            return(sum/numStudents);
    }
    int getNumStud(){
        return numStudents;
    }

    String getName(){
        return name;
    }

    public Student[] getList() {
        return list;
    }
}

