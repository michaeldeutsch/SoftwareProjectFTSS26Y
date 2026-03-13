package unit02.lombok.student;

public class Main {


    static void main(String[] args) {
        Student s = new Student(); // no args
        Student temp = new Student("asdf","adfasfd",""); // required
        Student student = new Student(1, "asdf","af","asdfasd","dsafsfd","asdf",true,null) ;
        // allargs

        student.getId();
        student.getEmail();
        System.out.println(student);
        System.out.println(s);
        System.out.println(temp);;
    }
}
