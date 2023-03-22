package dataStructure;

import javax.swing.*;
import java.util.ArrayList;

public class Insertion_Sort
{
   public static void main (String[] args)
   {
    
       Insertion_Sort select = new Insertion_Sort();
    int NumIn = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF INPUTS:",null));
    ArrayList<Integer> NumArray = new ArrayList<Integer>();
    
    for(int x=0;x<NumIn;x++){
    int y = x+1;
    int num = Integer.parseInt(JOptionPane.showInputDialog("ENTER INPUT " + y + ": " ,null));
    NumArray.add(num);
    }
        System.out.println();
     System.out.print("Unsorted Array: ");
       select.display(NumArray);
       System.out.println();
       System.out.println();
 	System.out.println("Sorting Array (Ascending): ");
      select.sort(NumArray);
       System.out.println();
       System.out.print("Sorted Array Ascending: ");
      select.display(NumArray);
      System.out.println();
      System.out.println();
      System.out.println("Sorting Array (Descending): ");
      select.sortdes(NumArray);
       System.out.println();
       System.out.print("Sorted Array Descending: ");
      select.display(NumArray);
      
}

static void display(ArrayList<Integer> a)
{
    System.out.print("[ ");
for(int i=0; i<a.size();i++)
{
System.out.print(a.get(i)+" ");
try{
Thread.sleep(500);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
    System.out.print("]");
}

 static void sort(ArrayList<Integer> a)
{
	
     for (int j = 1; j < a.size(); j++) {

    	 
         int key = a.get(j);
         int i = j-1;
         

         
         while ( (i > -1) && ( a.get(i) > key ) ) {
             a.set(i+1, a.get(i));
             i--;
         }
         a.set(i+1, key);
         
    	 System.out.print("Pass " + j + ": ");
 	    Insertion_Sort.display(a);
 		System.out.println();
     }
}

     static void sortdes(ArrayList<Integer> a)
     {
     	
          for (int j = 1; j < a.size(); j++) {
         	
         	 
              int key = a.get(j);
              int i = j-1;
              while ( (i > -1) && ( a.get(i) < key ) ) {
                  a.set(i+1, a.get(i));
                  i--;
              }
              a.set(i+1, key);
              System.out.print("Pass " + j + ": ");
       	    Insertion_Sort.display(a);
       		System.out.println();
          }

     
}

 



}