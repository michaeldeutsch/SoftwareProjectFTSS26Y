package unit04;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {


    static void main() {
        HashSet<String> set = new HashSet<>();
        set.add("asdf");
        set.add("asdf");    set.add("asdf");
        set.add("asdf");    set.add("asdf");    set.add("asdf");

        TreeSet<String> treeSet = new TreeSet<>();


        set.forEach(System.out::println);





    }
}
