import com.sun.java.accessibility.util.AccessibilityListenerList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String []args){

        if(new Duck("McDuck") == new Duck("McDuck")){
            System.out.println("True");
        } else {
            System.out.println("Fouls");
        }


    }
    static void addTwo(List<String> list) {
         list.add("2");

        list.add("1");
        addTwo(list);
        System.out.println(list);
    }
}
