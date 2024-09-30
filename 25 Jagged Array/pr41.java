import java.util.*;
class P41{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter elements : ");
		for (int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
			System.out.println(arr[i]);
		}
	}
}

