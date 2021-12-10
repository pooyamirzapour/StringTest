import java.util.HashSet;
import java.util.Set;

public class RemoveFromStringBasedOnGivenString {

    public static void main(String[] args) {
        String first= "dvvf";
        String second="avddv";

        Set<String> set =new HashSet<>();
        for (char chr:first.toCharArray()) {
            set.add(String.valueOf(chr));
        }

        for (String str: set) {
            second = second.replace(str, "");
        }

        System.out.println(second);

    }
}
