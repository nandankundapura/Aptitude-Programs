package AptitudeProgram;

public class StringCharacterCounter {
    public static void main(String[] args) {
        String str = "Hello Java 123";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);

            if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                // Vowels check (both uppercase & lowercase)
                if (code == 65 || code == 69 || code == 73 || code == 79 || code == 85 ||  // A,E,I,O,U
                        code == 97 || code == 101 || code == 105 || code == 111 || code == 117) { // a,e,i,o,u
                    vowels++;
                } else {
                    consonants++;
                }
            }
            else if (code >= 48 && code <= 57) {
                digits++;
            }
            else if (code == 32) {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespaces: " + spaces);
    }
}