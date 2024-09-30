import java.io.*;
class P42{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter array size : ");
		int arrSize = Integer.parseInt(br.readLine());
		
		int arr[] = new int[arrSize];
		System.out.println("Enter elelments :");
		for (int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
