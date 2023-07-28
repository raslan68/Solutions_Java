package find_results;

import java.util.*;

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

        long startTime = System.currentTimeMillis();

        Find_Dublicate_Elements dub = new Find_Dublicate_Elements();
        dub.dublicateElement(list);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Code execution took: " + duration + " milliseconds");

    }

}

            // With Stream
    /* Set<String> list = elements.stream().filter(s -> !set.add(s)).collect(Collectors.toSet());
        System.out.println(list);*/

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
