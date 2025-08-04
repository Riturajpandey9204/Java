package StringInterviewQuestions;

public class RemoveAllSpecialCharaters {
    public static void main(String[] args) {
        String str = "J@a!!v$ %a^i&s*G+O__A-T$%";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

    }
}
