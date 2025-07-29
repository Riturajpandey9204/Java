package CommonInterviewQuestions;

public class ContainsVowelsOrNot {
    public static void main(String[] args) {
        String str = "Ritu Raj Pandey";
        System.out.println(containsVowelsOrNot(str));
        //counting number of vowels
        int totalNumberOfVowels = str.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println("Total = " + totalNumberOfVowels);
    }
    public static boolean containsVowelsOrNot(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
