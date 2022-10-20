package Stream;

//finding Max and Min product price

import java.util.ArrayList;
import java.util.List;

public class Example13 {

    public static void main(String[] args) {

        List<Example12> productsList = new ArrayList<>();
        productsList.add(new Example12(1, "Books", 10));
        productsList.add(new Example12(2, "Pens", 20));
        productsList.add(new Example12(3, "Pencils", 30));

        //max method to get max product price
        Example12 obj1 = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1:-1).get();
        System.out.println(obj1.price);

        //min method to get min product price
        Example12 obj2 = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1:-1).get();
        System.out.println(obj2.price);

    }
}
