package learnJava;

import java.util.List;

public class Learning {
    public void changeString(String testString) {
        testString.replaceAll("w", "s");
    }
    public void changeLearningTest(LearningTest learningTest) {
        learningTest.testVar = "test changed";
    }

    public void changeArrayElement(List<Integer> arrayList) {
        arrayList.remove(1);
    }

    public void chageIntegerValue(Integer intValue) {
        intValue = 1;
    }
}

class LearningTest {
    public String testVar = "test";
}
