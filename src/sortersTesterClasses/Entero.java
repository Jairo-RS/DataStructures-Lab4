package sortersTesterClasses;

import java.util.Comparator;

import sorterClasses.InsertionSortSorter;

public class Entero { 
    private int value; 
    public Entero(int v) { value = v; }
    public int getValue() { return value; } 
    public String toString() { return value + ""; }
    
    public static void main (String args[]) {
    	Entero[] testArray = new Entero[10];
    	for(int i=0; i<testArray.length; i++)
    		testArray[i] = new Entero(i);
    	InsertionSortSorter<Entero> sorter = new InsertionSortSorter<>();
    	Comparator<Entero> comparator = null;
    	sorter.sort(testArray, comparator);
    	}
 } 