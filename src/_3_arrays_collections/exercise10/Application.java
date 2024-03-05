package _3_arrays_collections.exercise10;

public class Application {

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("taal", "language");
        dictionary.add("taal", "langue");
        
        dictionary.add("auto", "car");
        dictionary.add("auto", "vehicle");
        
        System.out.println(dictionary.translate("taal"));
        dictionary.remove("auto");
        System.out.println(dictionary.translate("auto"));
    }
}
