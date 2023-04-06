package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
        public static void main(String args[])
        {
                HashSet<Integer> set = new HashSet<>();

                //Insertion
                set.add(1);
                set.add(2);
                set.add(3);
                set.add(1); // This wont be added since only unique elements are added to a hashSet

                if(set.contains(1))
                {
                        System.out.println("Set Contains 1");
                }

                if(!set.contains(6))
                {
                        System.out.println("Does not contain");
                }

                // Delete

                set.remove(1);
                
                if(!set.contains(1))
                {
                        System.out.println("Does not contain");
                }
                // Printing th esize of the hash Set

                System.out.println("Size of the set is : " + set.size());
                // Print all elements
                System.out.println(set);

                // Iterator
                /*
                for(int i = 0; i < n; i ++)
                {
                        //Here i is an iterator
                }
                */

                Iterator it = set.iterator();

                while(it.hasNext())
                {
                        System.out.println(it.next());
                }
        }
}
