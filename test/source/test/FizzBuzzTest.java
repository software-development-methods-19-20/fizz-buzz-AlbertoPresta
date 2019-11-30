package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.FizzBuzz;
import src.fizzmap;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class FizzBuzzTest {

    @Test
    void MultipleOfThreeandFive(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(5);
        ArrayList<String> b = new ArrayList<String>();
        b.add("fizz");
        b.add("buzz");
        check(15,"fizzbuzz",a,b);
    }



    @Test
    void MultipleOfFive(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        ArrayList<String> b = new ArrayList<String>();
        b.add("buzz");
        check(10,"buzz",a,b);
    }



    @Test
    void MultipleOfSeven(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(7);
        ArrayList<String> b = new ArrayList<String>();
        b.add("Bang");
        check(14,"Bang",a,b);
    }

    @Test
    void MultipleOfThreeAndSeven(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(5);
        a.add(7);
        ArrayList<String> b = new ArrayList<String>();
        b.add("fizz");
        b.add("buzz");
        b.add("Bang");
        check(21,"fizzBang",a,b);
    }

    @Test
    void MultipleOfThreeAndFiveAndSevent(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(5);
        a.add(7);
        ArrayList<String> b = new ArrayList<String>();
        b.add("fizz");
        b.add("buzz");
        b.add("Bang");
        check(105,"fizzbuzzBang",a,b);
    }




    @Test
    void MultipleOfThree(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        ArrayList<String> b = new ArrayList<String>();
        b.add("fizz");
        check(6,"fizz",a,b);
    }

 @Test
 void noFactor(){
     ArrayList<Integer> a = new ArrayList<Integer>();
     ArrayList<String> b = new ArrayList<String>();
     check(7,"7",a,b);
 }




    public void check(int decimal,String st, ArrayList<Integer> a,ArrayList<String> b){
        fizzmap map = new fizzmap(a,b);
        FizzBuzz c = new FizzBuzz(115,map);
        assertEquals(c.convert(decimal),st);
    }


}
