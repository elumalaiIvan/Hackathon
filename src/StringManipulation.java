import java.util.LinkedList;
import java.util.List;

public class StringManipulation {

    public static void main(String[] args) {
        String input = "abctrxyrst";
        findAdjacentPairs(input);
    }

    /*
    input: abctrxyrst
    output: [abc, xy, rst]
     */

    public static void findAdjacentPairs(String input) {
      char[] chars = input.toCharArray();
      char previousCharAscii = chars[0];
      List<String> adjacentValues = new LinkedList<>();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(previousCharAscii);
      for (int i=1; i<chars.length; i++) {
          char currentAscii = chars[i];
          if (currentAscii-1 == previousCharAscii) {
              stringBuilder.append(currentAscii);
          } else {
              if (stringBuilder.length() > 1) {
                  adjacentValues.add(stringBuilder.toString());
              }
              stringBuilder = new StringBuilder();
              stringBuilder.append(currentAscii);
          }
          previousCharAscii = currentAscii;
      }
      if (stringBuilder.length() > 1) {
          adjacentValues.add(stringBuilder.toString());
      }
        System.out.println(adjacentValues);
    }


}

