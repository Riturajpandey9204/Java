package StringInterviewQuestions;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "  j a  vaS t       a r   ";
        System.out.println(str.replaceAll("[\\s]",""));
    }
}