package Stream;

//Convert List into Set
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example17 {

    public static void main(String[] args) {

        List<Example16> productsList = new ArrayList<>();
        productsList.add(new Example16(1, "String1", 100));
        productsList.add(new Example16(2, "String2", 200));
        productsList.add(new Example16(3, "String1", 300));

        //System.out.println(productsList);

        //Converting product List into Set
        Set<Float> productPriceList = productsList.stream()
                .filter(product -> product.price < 400)
                .map(product -> product.price)
                .collect(Collectors.toSet()); //collect it as Set(remove duplicate elements

        System.out.println(productPriceList);
    }
}
