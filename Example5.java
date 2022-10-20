package Stream;

//Stream Iterating Example

import java.util.stream.Stream;

public class Example5 {

    public static void main(String[] args) {

        Stream.iterate(5, element -> element+1)
                .filter(element -> element%5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
