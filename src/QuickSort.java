import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int [] array = new int[] {5, 89, 47, 3, 6, 78, 15, 74, 36, 107, 21, 54, 94, 9};
		System.out.println(Arrays.toString(array));
		
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	public static void quickSort(int[]arr, int from, int to) {
		if(from<to) {
			int divideIndex = partition(arr, from, to);
			
			quickSort(arr, from, divideIndex-1);
			quickSort(arr, divideIndex, to);
		}
	}
	public static int partition(int[]arr, int from, int to) {
		int rightIndex = to;
		int leftIndex = from;
		
		int pivot = arr[from + (to-from)/2];
		while(leftIndex <= rightIndex) {
			while(arr[leftIndex]<pivot) {
				leftIndex++;
			}
			while(arr[rightIndex]>pivot) {
				rightIndex--;
			}
			if(leftIndex <= rightIndex) {
				swap(arr, rightIndex, leftIndex);
				leftIndex++;
				rightIndex--;
			}
		}
		return leftIndex;
	}
	private static void swap(int[]array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}

}
