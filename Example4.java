package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {

        List<Example3> productslist = new ArrayList<>();
        productslist.add(new Example3(1, "Food", 200f));
        productslist.add(new Example3(2, "Clothes", 400f));
        productslist.add(new Example3(3, "Vehicle", 600f));

        List<Float> productPriceList2 = productslist.stream()
                .filter(p -> p.price >200)
                .map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(productPriceList2);
    }
}
