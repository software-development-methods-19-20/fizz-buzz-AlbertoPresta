package src;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class fizzmap {
    private Map<Integer, String> mappa = new LinkedHashMap<>();



    public fizzmap(ArrayList<Integer> numbers, ArrayList<String> stringhe){
        for (int i = 0; i < numbers.size(); i = i + 1) {
            this.mappa.put(numbers.get(i), stringhe.get(i));
        }
    }



    public Set<Integer> keySet() {
        return this.mappa.keySet();
    }

    public String get(Integer j) {
        return this.mappa.get(j);
    }
}



