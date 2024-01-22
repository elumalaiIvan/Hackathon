package learnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearningMain {
    public static final ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Learning learning = new Learning();
        String testString = "wow";
        learning.changeString(testString);
        System.out.println(testString);

        LearningTest learningTest = new LearningTest();
        learningTest.testVar = "ada";
        learning.changeLearningTest(learningTest);
        System.out.println(learningTest.testVar);

        arrayList.add(4);
        arrayList.add(5);
        learning.changeArrayElement(arrayList);
        System.out.println(arrayList);

        Integer intValue = 5;
        learning.chageIntegerValue(intValue);
        System.out.println(intValue);
    }
}
