package _3_arrays_collections.exercise8;

import java.util.HashMap;
public class Application {

    public static void main(String[] args) {
        HashMap<String, String> nameAbbreviations = new HashMap<>();
        nameAbbreviations.put("matthew", "matt");
        nameAbbreviations.put("michael", "mix");
        nameAbbreviations.put("arthur", "artie");

        System.out.println(nameAbbreviations.get("matthew"));

    }
}
