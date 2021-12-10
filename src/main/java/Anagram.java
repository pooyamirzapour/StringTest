import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        // Get lenghts of both strings

        char[] str1="babak".toCharArray();
        char[] str2="kabab".toCharArray();
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            System.out.println(false);;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                System.out.println(false);;

        System.out.println(true);;
    }
}
