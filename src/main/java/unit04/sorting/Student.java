package unit04.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student implements Comparable<Student> {

    int id;
    String name;
    int age;
    double avgGrade;

    @Override
    public int compareTo(Student o) {
        if(this.avgGrade > o.avgGrade) {
            return 1;        }


        return 0;
    }


 //   @Override
//    public int compareTo(Student o) {
////        if(this.age == o.age){
////            return this.id - o.id;
////        } else   {
////            return this.age - o.age;
////        }
////
////    }
}
