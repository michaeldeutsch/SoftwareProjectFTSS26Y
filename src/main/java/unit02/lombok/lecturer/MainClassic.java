package unit02.lombok.lecturer;

public class MainClassic
{
    public static void main(String[] args)
    {
        Lecturer first = Lecturer.builder().id(1).email("asdfas").name("asdf").build();
        Lecturer second = Lecturer.builder().id(1).name("234").build();
        System.out.println(first);
        System.out.println(second);

    }
}
