package SortArrayList;

//import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args) {
	    // Create an Integer array
	    Integer[] intArray = {new Integer(2), new Integer(4),
	      new Integer(3)};

	    // Create a Double array
	    Double[] doubleArray = {new Double(3.4), new Double(1.3),
	      new Double(-22.1)};

	    // Create a Character array
	    Character[] charArray = {new Character('a'),
	      new Character('J'), new Character('r')};

	    // Create a String array
	    String[] stringArray = {"Tom", "Susan", "Kim"};

	    // Sort the arrays
	    sort(intArray);
	    sort(doubleArray);
	    sort(charArray);
	    sort(stringArray);

	    // Display the sorted arrays
	    System.out.print("Sorted Integer objects: ");
	    printList(intArray);
	    System.out.print("Sorted Double objects: ");
	    printList(doubleArray);
	    System.out.print("Sorted Character objects: ");
	    printList(charArray);
	    System.out.print("Sorted String objects: ");
	    printList(stringArray);
	  }
	
//	 public static <E extends Comparable<E>> void sort(ArrayList<int> list) {
//
//
//	        for (int i = 0; i < list.size() - 1; i++) {
//	            E currentMin = list.get(i);
//	            int min = i;
//	            for (int j = i + 1; j < list.size(); j++) {
//
//	                if (list.get(j).compareTo(currentMin) < 0) {
//	                    currentMin = list.get(j);
//	                    min = j;
//	                }
//	            }
//
//	            if (min != i) {
//	                list.set(min, list.get(i));
//	                list.set(i, currentMin);
//	            }
//	        }

	  /** Sort an array of comparable objects */
	  public static <E extends Comparable<E>> void sort(E[] list) {
	    E currentMin;
	    int currentMinIndex;

	    for (int i = 0; i < list.length - 1; i++) {
	      // Find the minimum in the list[i..list.length-1]
	      currentMin = list[i];
	      currentMinIndex = i;

	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin.compareTo(list[j]) > 0) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	  }

	  /** Print an array of objects */
	  public static void printList(Object[] list) {
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	    System.out.println();
	  }
		  
		  
}

