package Stream;

import java.util.ArrayList;
import java.util.List;

//using reduce method
public class Example9 {

    public static void main(String[] args) {

        List<Example8> productsList = new ArrayList<>();
        productsList.add(new Example8(1, "Food", 100f));
        productsList.add(new Example8(2, "Clothes", 300f));
        productsList.add(new Example8(3, "Vehicle", 500f));

        //a compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price)->sum+price); //accumulating price
        System.out.println(totalPrice);

        //more precise code
        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);
        System.out.println(totalPrice2);
    }
}
