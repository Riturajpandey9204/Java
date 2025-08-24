package CommonInterviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Rituraj";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){

        if(str == null){
            System.out.println("Enter a valid String : ");
        }
        StringBuilder result = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
        result.append(chars[i]);
        }
        return result.toString();
    }
}
