package _3_arrays_collections.exercise10;

import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {

    HashMap<String, ArrayList<String>> translatedWords;

    public DictionaryOfManyTranslations(){
        this.translatedWords = new HashMap<>();
    }

    public void add(String word, String translation){
        if(translatedWords.containsKey(word)){
            translatedWords.get(word).add(translation);
        }
        else{
           ArrayList<String> values = new ArrayList<String>();
           values.add(translation);
           translatedWords.put(word, values); 
        }
    }

    public ArrayList<String> translate(String word){
        if(translatedWords.get(word) != null){
            return translatedWords.get(word);
        }
        else{
            ArrayList<String> emptyList = new ArrayList<String>();
            return emptyList;
        }
    }

    public void remove(String word){
        for(String key : translatedWords.keySet()){
            if(key == word){
            }
        }
        translatedWords.remove(word);
    }
    
}
