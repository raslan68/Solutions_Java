package find_results;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Dublicate_Elements {

    List<String> elements;

    public Find_Dublicate_Elements(List<String> elements) {
        this.elements = elements;
    }

    public void dublicte(){
        Set<String> list = new HashSet<>();
        boolean flag = false;
        for (String el : elements){
           if (list.add(el)== false) {
               System.out.println(el);
               flag=true;
           }
        }
        if (flag==false) {
            System.out.println("not found");
        }
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
