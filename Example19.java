package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert List into Map
public class Example19 {

    public static void main(String[] args) {

        List<Example18> productsList = new ArrayList<>();
        productsList.add(new Example18(1, "String1", 100));
        productsList.add(new Example18(2, "String2", 200));
        productsList.add(new Example18(3, "String3", 300));

        //Converting Product List into a Map
        Map<Integer, String> productPriceMap = productsList.stream()
                .collect(Collectors.toMap(p -> p.id, p-> p.name));

        System.out.println(productPriceMap);
    }
}
