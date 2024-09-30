import java.util.*;
class P57{
        public static void main(String[ ]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for row and col" );
		int row = sc.nextInt();
		int col = sc.nextInt();

                int arr[][] = new int[row][col];
                //arr[0] = new int[3];
                //arr[1] = new int[5];
                //arr[2] = new int[2];
		System.out.println("Enter element in array : ");
                for (int i=0; i<arr.length; i++){
                	for (int i=0; i<arr[i].length; i++){
				arr[i][j] = sc.nextInt();
			}

		}

                for (int i=0; i<arr.length; i++){
                        for (int j=0; j<arr[i].length; j++){
                                System.out.print(arr[i][j]+"  ");
                        }
                        System.out.println();
                }

                //arr[1][2] = 50;
                //System.out.println(arr[1][2]);
        }
}

