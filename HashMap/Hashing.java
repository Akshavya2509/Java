package HashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Hashing {
    public static void main(String[] args) {
        // Country(Key), Population(Value)
        HashMap<String, Integer> map = new HashMap<>();


        // Insertion Operation
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        // HashMaps Are unordered maps

        map.put("China", 180);

        System.out.println(map);

        if(map.containsKey("China"))
        {
            System.out.println("Key Exists");;
        }

        else
        {
            System.out.println("Key Doesnt Exist");
        }
/*  
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        int arr[] = {10, 20, 30};

        for(int i = 0; i < 3; i ++)
        {
            System.out.println(arr[i] + " ");
        }

        System.out.println();

        for(int val : arr)
        {
            System.out.println(val + " ");
        }

        System.out.println();
*/

        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }

        // remove

        map.remove("China");

        System.out.println(map);
    }
}
