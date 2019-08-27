package classnobject;

public class Student {
     String studentName;
     int studentID;                        //states or properties
    int studentDOB;                       // data type -> variablename ->
     String studentAddress;
     String studentEmail;



    //Method
    public void takeExam(){
        System.out.println("Students are taking exam");
    }

    public void attendClass() {
        System.out.println("Student comes to class");
    }

    public static void main(String[] args) {
        Student student1=new Student();
        student1.studentName="Imani";
        student1.studentID=201;
        student1.studentDOB=2019;
        student1.studentEmail="timani@gmail.com";
        student1.studentAddress="Queens, NY";
        System.out.println(student1.studentID);
        System.out.println(student1.studentName);
        System.out.println(student1.studentDOB);
        System.out.println(student1.studentEmail);
    }
}
