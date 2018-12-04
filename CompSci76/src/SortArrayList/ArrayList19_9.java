//Austin Castellino
//CompSci 76 TTh 6-9
//Generics, chapter 19.09
//Use of generics and Arraylists
//Sort elements in the ArrayList

package SortArrayList;

import java.util.ArrayList;

public class ArrayList19_9 {
	public static void main(String[] args) {
		ArrayList stack = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
        
        // Create an Integer arraylist
	   ArrayList <Integer> intArray = new ArrayList<>();
	   intArray.add(2);
	   intArray.add(4);
	   intArray.add(3);
			   
	    // Create a Double arraylist
	   ArrayList<Double> dArray = new ArrayList<>();
	   dArray.add(12.1);
	   dArray.add(6.7);
	   dArray.add(24.8);

	    // Create a Character arraylist
	   ArrayList<Character> cArray = new ArrayList<>();
	   cArray.add('j');
	   cArray.add('y');
	   cArray.add('a');

	    // Create a String array
	    String[] stringArray = {"Tom", "Susan", "Kim"};
	    
	    //sort the ArrayLists
	    sort(intArray);
	    sort(dArray);
	    sort(cArray);
	    //Print the sorted ArrayLists
	    System.out.println("Interger List Sorted: " + intArray);
	    System.out.println("Double List Sorted: " + dArray);
	    System.out.println("Char List Sorted: " + cArray);

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {


        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }

            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
