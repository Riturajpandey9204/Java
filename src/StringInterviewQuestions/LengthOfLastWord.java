package StringInterviewQuestions;

public class LengthOfLastWord {

    public static void main(String[] args) {

    String str = "Length of last word ";
        System.out.println(lengthOflastWord(str));
    }

    static  int lengthOflastWord(String s){
        int count = 0;
        String str = s.trim();
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) != ' '){
             count++;
            }else {
                break;
            }
        }
        return count;
    }
}
