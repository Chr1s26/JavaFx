

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();

        //Example 1
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println(list_Strings);

        //Example 2 - iterate through all elements in an array list
        for (String element : list_Strings){
            System.out.println(element);
        }

        //Example 3 - Add pink at the first position
        list_Strings.add(0,"Pink");
        System.out.println(list_Strings);
        //Add yellow at the last position
        list_Strings.add(list_Strings.size(), "Yellow");
        System.out.println(list_Strings);


    }
}
