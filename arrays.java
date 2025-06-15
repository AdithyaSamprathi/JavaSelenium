import java.util.*;
public class arrays {
    public static void main(String[] args){

        // Pending  see brocode link https://www.youtube.com/watch?v=xTtL8E4LzTQ
        // 5 hrs 16 mins to learn and code defining the size of the array from user input
        String []foods = new String[3];
        // Assigning 3 values
        foods[0] ="Pani";
        foods[1]= "puri";
        foods[2] = "bhel";

        for(String f:foods){
            System.out.println(f);

        }

        // Array with 0 values
        String [] noffods = {};

        System.out.println("This array has Zero value " + noffods.length);

        String[] fruits = {"Apple","Orange","Banana","Pine"};
        //System.out.println(fruits[1]);

        //System.out.println(numFruits);
        Arrays.sort(fruits);

        for (int i = 0;i < fruits.length;i++){
           System.out.println(fruits[i]);
       }

      // Enhanced or Advanced for loop
        for(String s:fruits){
            System.out.println(s);

        }
    }
}
