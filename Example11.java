package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {

    public static void main(String[] args) {

        List<Example10> productsList = new ArrayList<>();
        productsList.add(new Example10(1, "Books", 20));
        productsList.add(new Example10(2, "NoteBooks", 30));
        productsList.add(new Example10(3, "Pens", 40));

        //using collector's method to sum the prices
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println(totalPrice3);
    }
}
