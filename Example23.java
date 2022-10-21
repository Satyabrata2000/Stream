package Stream;

//Dtream filter example. Here we are fetching and iterating filtered data

import java.util.ArrayList;
import java.util.List;

public class Example23 {

    public static void main(String[] args) {

        List<Example22> productsList = new ArrayList<>();
        productsList.add(new Example22(1, "String1", 101));
        productsList.add(new Example22(2, "String2", 102));
        productsList.add(new Example22(3, "String3", 103));
        productsList.stream()
                .filter(p -> p.price > 100) //filtering price
                .map(pm -> pm.price) //fetching price
                .forEach(System.out::println);
    }
}
