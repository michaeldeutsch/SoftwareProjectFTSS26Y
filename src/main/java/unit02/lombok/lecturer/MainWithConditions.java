package unit02.lombok.lecturer;

public class MainWithConditions {

    public static void main(String[] args) {

       //  Lecturer l = Lecturer.builder().build();
        String email = "asfd"; // optional field needs to be checked

        var temp = Lecturer.builder().id(1).name("234"); // mandatory


        if(email != null || !email.isEmpty())  temp.email(email);

        Lecturer l =  temp.build();




    }
}
