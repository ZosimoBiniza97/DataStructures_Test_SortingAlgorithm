package dataStructure;

import javax.swing.*;
import java.util.ArrayList;

public class Biniza_Zosimo
{
   public static void main (String[] args)
   {
    
       Biniza_Zosimo select = new Biniza_Zosimo();
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
   
      for(int pass = 0; pass<(a.size()-1);pass++){
    	  
	System.out.print("Pass " + pass + ": ");
    Biniza_Zosimo.display(a);
	System.out.println();
	 int min = pass;
    for(int i = pass+1; i<a.size(); i++)
    if(a.get(i)<a.get(min))
min = i;
if(min!=pass){
    int tmp=a.get(min);
    a.set(min,a.get(pass));
    a.set(pass,tmp);


}

}
}

 static void sortdes(ArrayList<Integer> a)
{
   
      for(int pass = 0; pass<(a.size()-1);pass++){
    	  System.out.print("Pass " + pass + ": ");
    	    Biniza_Zosimo.display(a);
    		System.out.println();
    int min = pass;
    for(int i = pass+1; i<a.size(); i++)
    if(a.get(i)>a.get(min))
min = i;
if(min!=pass){
    int tmp=a.get(min);
    a.set(min,a.get(pass));
    a.set(pass,tmp);

}

}
}


}