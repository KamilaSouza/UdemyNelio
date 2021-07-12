import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // list does not work with primitive types   <> = generics
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
    //    list.remove("Anna");

        list.removeIf(x -> x.charAt(0) == 'M'); // remove all words that starts with M
        // list.removeIf(x -> x.charAt(0) != 'M');

        System.out.println(list.size());
        // for each
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // find the object position
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // lambda operations

        for (String x : result) {
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
