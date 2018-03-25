package sortersTesterClasses;

import java.util.Arrays;

import sorterClasses.SelectionSortSorter;

public class SortTesterEx2 {
	
	public static void main(String[] args) {
		Integer[] sortingArray = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		System.out.println("Original array given: " + Arrays.toString(sortingArray));
		
		SelectionSortSorter<Integer> sorting = new SelectionSortSorter<>();
	    IntegerComparator1 comparator1  = new IntegerComparator1();
	    sorting.sort(sortingArray, comparator1);
	    System.out.println("Sorted in increasing order: " + Arrays.toString(sortingArray));
	    
	    IntegerComparator2 comparator2 = new IntegerComparator2();
	    sorting.sort(sortingArray, comparator2);
	    System.out.println("Sorted in decreasing order: " + Arrays.toString(sortingArray));
	}

}
