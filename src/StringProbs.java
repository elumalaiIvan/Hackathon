import java.util.HashMap;

public class StringProbs {
    public static void main(String[] args) {
//        System.out.println(reverseString("change"));
//        System.out.println(subStringCount1("hello my dear, hello baby", "hello"));
//        System.out.println(customSubString("customSubString", 6,8));
//        System.out.println(Arrays.toString(customSplit("custom SubString program", " ")));
//        System.out.println(charCount("Hello worllddH"));
        System.out.println(addStrings("56","83"));
    }

    static int subStringCount(String sampleString, String subString) {
        int sampleStringLength = sampleString.length();
        int subStringLength = subString.length();
        int withoutSubstringLength = sampleString.replaceAll(subString, "").length();
        return (sampleStringLength - withoutSubstringLength) / subStringLength;
    }

    static HashMap<Character, Integer> charCount(String sampleString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < sampleString.length(); i++) {
           char ch = sampleString.charAt(i);
           Integer count = charCountMap.getOrDefault(ch, 0) + 1;
           charCountMap.put(ch, count);
        }
        return charCountMap;
    }

    static int subStringCount1(String sampleString, String subString) {
        int count = 0;
        int index = sampleString.indexOf(subString);
        while (index != -1) {
            count++;
            index = sampleString.indexOf(subString, index + subString.length());
        }
        return count;
    }

    static String[] customSplit(String sampleString, String delimiter) {

        int delimiterCount = subStringCount1(sampleString, delimiter);
        // hello, world, buddy ==> here delimiter is 2 but word count is three as
        String[] splitWords = new String[delimiterCount + 1];
        int delimeterIndex = sampleString.indexOf(delimiter);
        int start = 0;
        int i = 0;
        while (delimeterIndex != -1) {

            String word = customSubString(sampleString, start, delimeterIndex - 1);
            splitWords[i++] = word;

            // delimiter legth is added as delimiter can be in any length like ( , "" " " "aks" :  )
            start = delimeterIndex + delimiter.length();
            delimeterIndex = sampleString.indexOf(delimiter, start);

        }
        splitWords[i] = customSubString(sampleString, start);
        return splitWords;
    }

    static String customSubString(String sampleString, int fromIndex) {
        return customSubString(sampleString, fromIndex, sampleString.length() - 1);
    }

    // sample st
    // 123456789
    static String customSubString(String sampleString, int fromIndex, int toIndex) {
        //skipping fromIndex and toIndex validation for the sake of simplicity
        char[] sampleCharArray = sampleString.toCharArray();
        // 1 is added to include last toIndex value
        char[] newCharArray = new char[toIndex - fromIndex + 1];

        // System.arrayCopy can also be used
        for (int i = fromIndex; i <= toIndex; i++) {
            newCharArray[i-fromIndex] = sampleCharArray[i];
        }
        return new String(newCharArray);
    }

    static String reverseString(String sampleString) {
        // can be done easily like this
//        new StringBuilder(input).reverse().toString();
        char[] tempCharArray = sampleString.toCharArray();
        int leftPointer = 0;
        int rightPointer = tempCharArray.length - 1;

        while (leftPointer < rightPointer) {
            char temp = tempCharArray[leftPointer];
            tempCharArray[leftPointer] = tempCharArray[rightPointer];
            tempCharArray[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }

        return new String(tempCharArray);
    }

    // s1 5 6 7   : s2 8 3
    static String addStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            // 0 ascii is 48; 1 is 49 so on ....
            int firstNumber = i < 0 ? 0 : s1.charAt(i--) - '0';
            int secondNumber = j < 0 ? 0 : s2.charAt(j--) - '0';
            int total = firstNumber + secondNumber + carry;
            carry = total/10;
            result.append(total%10);
        }
        // calculating carry for the last digit should place it as its, as there is no more element to consider
        if (carry > 0) result.append(carry);

        return result.reverse().toString();
    }
}


