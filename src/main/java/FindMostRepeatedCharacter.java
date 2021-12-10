import java.util.*;

public class FindMostRepeatedCharacter {

    public static void main(String[] args) {
        String str = "aaaaabbsssddbbb";

        Map<String, Integer> map = new HashMap<>();

        for (char chr : str.toCharArray()) {
            Integer count = map.get(String.valueOf(chr));
            if (count == null)
                map.put(String.valueOf(chr), 1);
            else
                map.put(String.valueOf(chr), count + 1);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int max=0;
        String most="";
        for ( Map.Entry<String, Integer> entry:entries) {
            if (entry.getValue()>max) {
                most = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println( most);
        System.out.println( Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());


    }
}
