package CodingAssignments;

public class Assignment1 {
	//Maximum and minimum number in the array?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 4, 87, 12, 45, 6};
		int min=arr[0];
		int max=arr[0];

		for (int i=0; i<arr.length; i++) {
		if (arr[i]<min) {
		min=arr[i];
		}
		if (arr[i]>max) {
		max=arr[i];
		System.out.println("Minimum of array is "+min+" and Maximum of array is "+max);
		}
	}
	}
}
