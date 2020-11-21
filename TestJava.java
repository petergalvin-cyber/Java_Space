import java.util.*;

public class TestJava {
    {counter = 1000;}
    private static int counter =10;
    static {counter = 200;}
    //{counter = 1000;}
    public static void main(String[] args){
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("sdfgdfgsd");
        
        System.out.println("Its works! "+ TestJava.counter);
        System.out.println("Its works! "+ TestJava.counter);
        TestJava p = new TestJava();
        System.out.println("Its works! "+ TestJava.counter);
        p.counter = 3000;
        System.out.println("Its works! "+ p.counter);
        
        //System.out.println("Its works! "+ TestJava.counter);
    }
}