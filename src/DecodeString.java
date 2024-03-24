import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
//        System.out.println(decode("2a2[bc2[d]]]"));
//        System.out.println(decode("2a2[c3b]er"));
        System.out.println(bracketBalance("2[a[bm]]"));
    }

    static String decode1(String input) {



        return "";
    }

    static boolean bracketBalance(String string) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar != ']') {
                stack.push(currentChar);
            } else {
                boolean startFound = false;
                while (!stack.isEmpty() && !startFound) {
                    if (stack.pop() == '[') {
                        startFound = true;
                    }
                }
                if (!startFound) return false;
            }
        }

        while (!stack.empty()) {
            if (stack.pop() == '[') {
                return false;
            }
        }

        return true;
    }
    static String decode(String str) {
        String decodeString = "";
        Stack<Character> stack = new Stack<>();
        StringBuilder stringRep = new StringBuilder();
        StringBuilder resultBuilder = new StringBuilder();

        for(int i = 0; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ']') {
                StringBuilder currentStringBuilder = new StringBuilder();
                while (!stack.empty() && stack.peek() != '[') {
                    char popedElement = stack.pop();
                    if (Character.isDigit(popedElement)) {
                        int times = Character.getNumericValue(currentChar);
                        for (int j = 0; j < times; j++) {
                            currentStringBuilder.append(currentStringBuilder);
                        }
                    } else {
                        currentStringBuilder.append(currentChar);
                    }
                }
                // pop [
                stack.pop();
            } else {
                System.out.println("pushed -> " + currentChar);
                stack.push(currentChar);
            }
        }
        return decodeString;
    }

    private static StringBuilder fillStrings(char currentChar, StringBuilder stringBuilder) {
        StringBuilder rebBuilder = new StringBuilder();
        if (Character.isDigit(currentChar)) {
            int times = Character.getNumericValue(currentChar);
            for (int t = 0; t<times; t++) {
                rebBuilder.append(stringBuilder);
            }
        } else {
            stringBuilder.append(currentChar);
        }
        return rebBuilder;
    }
}
