package basicJava;

public class Example {
	static void CombinationRepetitionUtil(int chosen[], int arr[],int index, int r, int start, int end) {
		if (index == r) {
			for (int i = 0; i < r; i++) {
				System.out.printf("%d ", arr[chosen[i]]);
			}
			System.out.printf("\n");
			return;
		}

		// One by one choose all elements (without considering
		// the fact whether element is already chosen or not)
		// and recur
		for (int i = start; i <= end; i++) {
			chosen[index] = i;
			CombinationRepetitionUtil(chosen, arr, index + 1,
					r, i, end);
		}
		return;
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n with repetitions. This function mainly
	// uses CombinationRepetitionUtil()
	static void CombinationRepetition(int arr[], int n, int r) {
		// Allocate memory
		int chosen[] = new int[r + 1];

		// Call the recursive function
		CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int n = arr.length;
		int r = 2;
		CombinationRepetition(arr, n, r);
	}
}

