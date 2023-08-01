package designPatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Calculatable {
    List<Calculatable> calculatables = new ArrayList<>();

    CompositeBox(Calculatable... calculatable) {
        calculatables.addAll(Arrays.asList(calculatable));
    }

    @Override
    public double calculatePrice() {
        return calculatables.stream().mapToDouble(Calculatable::calculatePrice).sum();
    }
}
