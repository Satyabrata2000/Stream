package Stream;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<Example1> productsList = new ArrayList<>();
        productsList.add(new Example1(1, "Food", 20));
        productsList.add(new Example1(2, "Clothes", 30f));
        productsList.add(new Example1(2, "Vehicle", 100f));

        List<Float> productPriceList = new ArrayList<Float>();
        for(Example1 object: productsList){
            if(object.price < 200){
                productPriceList.add(object.price);
            }
        }
        System.out.println(productPriceList);
    }
}
