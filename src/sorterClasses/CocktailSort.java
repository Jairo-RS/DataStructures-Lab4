package sorterClasses;

public class CocktailSort<E> extends AbstractSorter<E> { 
	public CocktailSort() {
		super(" Cocktail Sort");
	}

	@Override
	protected void auxSort() {
		int m = arr.length;
		int t = 0;
		boolean ends = true;
		
		
		 while(ends){
			 ends = false;
			 
			 for (int j=0; j < m-1; j++) { 
					if (cmp.compare(arr[j], arr[j+1]) > 0) {
						super.swapArrayElements(j, j+1);
						ends = true;
					}
			 }
			 m--;
			 
			 if(ends) {
				 ends = false;
		 
				 for (int  j=m-1; j > t; j--) { 
					 if (cmp.compare(arr[j], arr[j-1]) < 0) {
						super.swapArrayElements(j, j-1);
						ends=true;
					 }
				 }
			 }
			 t++;
		 }
	}
}
