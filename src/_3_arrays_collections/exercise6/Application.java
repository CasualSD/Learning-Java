package _3_arrays_collections.exercise6;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        strings.remove(strings.size() - 1);
    }
}
