public class StringOps {

    public static void main(String[] args) {

     // System.out.println(java.util.Arrays.toString(allIndexOf("Hello world", 'l')));
    }

    public static String capVowelsLowRest(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            // checks for vowels a,e,i,o,u
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                res += (char) (c - 32);
            } else if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
                res += c;
            } else if ((c >= 'A') && (c <= 'Z')) {
                res += (char) (c + 32);
            } else {
                res += c;
            }
        }
        return res;
    }

    public static char letterToUpper(char c) {
        return ('a' <= c && c <= 'z') ? (char) (c - 32) : c;
    }

    public static char letterToLower(char c) {
        return ('A' <= c && c <= 'Z') ? (char) (c + 32) : c;
    }

    public static String camelCase(String string) {
        String res = "";
        res += (string.charAt(0) != 32) ? string.charAt(0) : "";
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != 32) {
                res += (string.charAt(i - 1) == 32) ? letterToUpper(string.charAt(i)) : letterToLower(string.charAt(i));
            }
        }
        res = letterToLower(res.charAt(0)) + res.substring(1);
        return res;
    }

    public static int[] allIndexOf(String string, char c) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                count++;
            }
        }

        int[] res = new int[count];
        int index = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == c) {
                res[index] = i;
                index++;
            }
        }

        return res;
    }
}
