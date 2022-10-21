package Stream;

//Java stream filter example 2

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example25 {

    public static void main(String[] args) {

        List<Example24> productsList = new ArrayList<>();
        productsList.add(new Example24(1, "String1", 101));
        productsList.add(new Example24(2, "String2", 102));
        productsList.add(new Example24(3, "String3", 103));
        productsList.add(new Example24(4, "String4", 104));

        List<Float> priceList = productsList.stream()
                .filter(p -> p.price > 100) //filtering price
                .map(pm -> pm.price) //fetching price
                .collect(Collectors.toList());
        System.out.println(priceList);
    }
}
