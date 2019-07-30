package arrayvsarraylist;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        String[] simpleArray = new String[2];
        simpleArray[0] = "alma";
        simpleArray[1] = "korte";
        int a = simpleArray.length;


        ArrayList<String> list = new ArrayList<>();
        list.add("alma")
        list.add("korte")

        int b = list.size();

        list.get(0);


        list.remove(0);


    }
}
