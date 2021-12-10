public class TwoStringAreRotationOfEachOther {

    public static void main(String[] args) {
        System.out.println(  areRotations("ABCD","DCBA"));
    }

    static boolean areRotations(String str1, String str2)
    {

        System.out.println(    reverseString("ABSC"));
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }

    static String reverseString(String string)
    {
      return   new StringBuilder(string).reverse().toString();

    }
}
