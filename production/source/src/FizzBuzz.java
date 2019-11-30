package src;


public class FizzBuzz {
    private final Integer max;
    private fizzmap mappa;



    public FizzBuzz(Integer max, fizzmap map){
        this.max = max;
        this.mappa = map;
    }


    public String convert(Integer i) {
        String res = "";
        for (Integer j : this.mappa.keySet()) {
            if (i % j == 0) {
                res = res + this.mappa.get(j);
            } else continue;
        }
        if(res=="")return To_str(i);
        else return res;
    }






    public void print() {
        for (Integer i = 1; i <= max; ++i) {
            System.out.println(convert(i));
        }
    }

    public String To_str(Integer i) {
        return Integer.toString(i);
    }
}

