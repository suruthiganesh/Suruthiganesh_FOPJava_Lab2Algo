package greatlearning;

public class MergeSort 
{
	void merge(int arr[], int left, int mid, int right) {
		
		int num1 = mid - left + 1;
		int num2 = right - mid;

		
		int leftArray[] = new int[num1];
		int rightArray[] = new int[num2];

		
		for (int i = 0; i < num1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < num2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		
		int i = 0, j = 0;

		
		int k = left;
		while (i < num1 && j < num2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		
		while (i < num1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		
		while (j < num2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// sorts array[left...right] using merge()
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			
			int mid = (left + right) / 2;

			
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			
			merge(notes, left, mid, right);
		}
	}
}


