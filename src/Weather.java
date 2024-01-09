import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubstring {

    public static void main(String[] args) {
        longestSubstring("abcbde");
    }

    private static void longestSubstring(String sampleString) {

        int leftPointer = 0;
        int rightPointer = 0;
        StringBuilder tempString = new StringBuilder();
        int maxLength = 0;

        while (rightPointer < sampleString.length()) {

            char currentCharacter = sampleString.charAt(rightPointer);
            boolean characterAlreadyNotPresent = tempString.indexOf(String.valueOf(currentCharacter)) == -1;

            if (characterAlreadyNotPresent) {
                maxLength = Math.max(maxLength, tempString.length());
                tempString.append(currentCharacter);
                rightPointer++;
            } else {
                tempString.deleteCharAt(leftPointer);
                leftPointer++;
            }

        }

        maxLength = Math.max(maxLength, tempString.length());
        System.out.println("substring is: " + tempString + " max length is: " + maxLength);

    }


}

