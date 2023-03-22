package dataStructure;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NewSample {

	public static void main(String[] args)
	{
		int size = 0;
		ArrayList <Integer> arr = new ArrayList<Integer>(); 
		NewSample.Input(arr, size);
		System.out.println("Before Sorting");
		NewSample.Display(arr);
		System.out.println("While Sorting");
		NewSample.SortThis(arr);
		System.out.println("After Sorting");
		NewSample.Display(arr);
	}
	
	public static void Input(ArrayList<Integer> array, int length)
	{
		int input;
		length = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Inputs: ",null));
		for(int i = 1; i<=length; i++)
		{
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter Input "+i+": " ,null));
		array.add(input);
		}
	}
	
	public static void SortThis(ArrayList<Integer> a)
	{


	     for (int j = 1; j < a.size(); j++) {
	    	 System.out.print("Pass " + j + ": ");
	    	    NewSample.Display(a);
	    		
	    	 
	         int key = a.get(j);
	         int i = j-1;
	         while ( (i > -1) && ( a.get(i) > key ) ) {
	             a.set(i+1, a.get(i));
	             i--;
	         }
	         a.set(i+1, key);
	         
	     }
	        
		
	}
	
	public static void Display(ArrayList<Integer> arr)
	{
		
		for ( int E : arr)
		{
			System.out.print(" "+E);
			
		}
		System.out.println();
		
	}
	
}
