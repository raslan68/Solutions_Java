package find_results;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Dublicate_Elements {

    public void dublicateElement(List<String> elements){
        Set<String> list = new HashSet<>();
        boolean flag = false;
        for (String el : elements){
           if (!list.add(el)) {
               System.out.println(el);
               flag=true;
           }
        }
        if (flag == false) {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C+");
        list.add("Java Script");
        list.add("Java");
        list.add("PHP");
        list.add("C+");

        Find_Dublicate_Elements dub = new Find_Dublicate_Elements();
        dub.dublicateElement(list);



    }

}
        //OR
    /* boolean flag = false;
        for (int i=0; i<elements.size(); i++){
            for (int j=i+1; j<elements.size();j++){
                if (elements.get(i) == elements.get(j)){
                        System.out.println("Dublicate Element: " + elements.get(i));
                        flag = true;
                }
            }
        }if (flag == false)
            System.out.println("Dublicate Element not found");*/
