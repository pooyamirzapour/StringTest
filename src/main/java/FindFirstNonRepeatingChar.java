import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "aaaagabbsssddbbb";

        Map<String, Integer> map = new HashMap<>();

        for (char chr : str.toCharArray()) {
            Integer count = map.get(String.valueOf(chr));
            if (count == null)
                map.put(String.valueOf(chr), 1);
            else
                map.put(String.valueOf(chr), count + 1);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for ( Map.Entry<String, Integer> entry:entries) {
            if (entry.getValue()==1) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
