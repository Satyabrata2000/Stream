package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//method reference in stream
public class Example21 {

    public static void main(String[] args) {

        List<Example20> productList = new ArrayList<>();
        productList.add(new Example20(1, "String1", 100));
        productList.add(new Example20(2, "String2", 101));
        productList.add(new Example20(3, "String3", 102));

        List<Float> productPriceList = productList.stream()
                .filter(p -> p.price > 100)  //filtering data
                .map(Example20::getPrice)    //fetching price by referring getPrice method
                .collect(Collectors.toList()); //collecting as list
        System.out.println(productPriceList);
    }
}
