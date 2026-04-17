package unit04.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data model for a Student that implements Comparable.
 * This allows students to be sorted automatically using Collections.sort().
 */
@AllArgsConstructor
@Data
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;
    private double avgGrade;

    /**
     * Comparison logic for sorting students.
     * Currently sorted by average grade in ascending order.
     * @param o the student to compare against
     * @return comparison result (negative if this is smaller, positive if larger)
     */
    @Override
    public int compareTo(Student o) {
        return Double.compare(this.avgGrade, o.avgGrade);
    }
}
