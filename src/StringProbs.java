import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProbs {
    public static void main(String[] args) {
//        System.out.println(reverseString("change"));
//        System.out.println(subStringCount1("hello my dear, hello baby", "hello"));
//        System.out.println(customSubString("customSubString", 6,8));
        System.out.println(Arrays.toString(customSplit("custom SubString program", " ")));
    }

    static int subStringCount(String sampleString, String subString) {
        int sampleStringLength = sampleString.length();
        int subStringLength = subString.length();
        int withoutSubstringLength = sampleString.replaceAll(subString, "").length();
        return (sampleStringLength - withoutSubstringLength) / subStringLength;
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
}


