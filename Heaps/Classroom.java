package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Classroom {

    static class Student3 implements Comparable<Student3>
    {
        String name;
        int rank;

        public Student3(String anme, int rank)
        {
            name = anme;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student3 s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student3> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student3("A", 4)); // O(Log n)
        pq.add(new Student3("B", 5));
        pq.add(new Student3("C", 2));
        pq.add(new Student3("D", 12));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank); // O(1)
            pq.remove(); // O(Log n)
        }
    }
} 