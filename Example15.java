package Stream;

import java.util.ArrayList;
import java.util.List;

public class Example15 {

    public static void main(String[] args) {

        List<Example14> productsList = new ArrayList<>();
        productsList.add(new Example14(1, "String1", 200));
        productsList.add(new Example14(2, "String2", 300));
        productsList.add(new Example14(3, "String3", 400));

        //count no of products based on the filter
        long count = productsList.stream()
                .filter(product -> product.price > 200)
                .count();
        System.out.println(count);
    }
}
