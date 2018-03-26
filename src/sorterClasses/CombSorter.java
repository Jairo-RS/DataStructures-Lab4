package sorterClasses;

public class CombSorter<E> extends AbstractSorter<E>{

	public CombSorter() {
		super("     Comb Sort");
	}

	@Override
	protected void auxSort() {
		int m = arr.length-1;
		
		
		for(int i=m; i>=0; i--) {
			for (int k=1; k <= i; k++) {
				if (cmp.compare(arr[k-1], arr[(k)]) > 0) {
					super.swapArrayElements(k-1, k);
				}
			}
		}
	}
}