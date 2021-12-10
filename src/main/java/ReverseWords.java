public class ReverseWords {

    public static void main(String[] args) {
        String str = "Java is the best";

        String[] split = str.split(" ");

        int length = split.length;

        String result="";
        for (int i = length; i >0 ; i--) {
            result =result + split[i-1]+ " ";
        }
        System.out.println(result.trim());


    }
}
