package designPatterns.composite;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Book("science", 200);
        Item item2 = new Bag("school bag", 400);
        Item item3 = new Book("english", 130);

        CompositeBox childBox11 = new CompositeBox(item1, item2);


        CompositeBox compositeBox = new CompositeBox(childBox11, item3);
//        300 + (300 + (300+0))
        System.out.println(compositeBox.calculatePrice());

    }
}
