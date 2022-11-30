import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(encode("Mamamakota"));

    }

    static String encode(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Map<Character, Integer> charFreq = new HashMap<>();
        String result = "";

        for (char charInWord : chars
        ) {
            Integer count = charFreq.get(charInWord);
            if (count == null) {
                charFreq.put(charInWord, 1);
            } else {
                charFreq.put(charInWord, ++count);
            }
        }

        for (Character c : chars) {
            if (charFreq.get(c) == 1) {
                result += "(";
            } else if (charFreq.get(c) > 1) {
                result += ")";
            }
        }
        return result;
    }
}
