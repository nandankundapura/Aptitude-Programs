package AptitudeProgram;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Number of words: " + count);
    }
}
