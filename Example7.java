package Stream;

import java.util.ArrayList;
import java.util.List;

public class Example7 {

    public static void main(String[] args) {

        List<Example6> productsList = new ArrayList<>();
        productsList.add(new Example6(1, "Food", 300));
        productsList.add(new Example6(2, "Clothes", 400));
        productsList.add(new Example6(3, "Vehicle", 600));

        //compact approach for filtering
        productsList.stream()
                .filter(product -> product.price == 300)
                .forEach(product -> System.out.println(product.name));
    }
}
