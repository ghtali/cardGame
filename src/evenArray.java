import java.util.Scanner;

public class evenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int counter = 0;
		Scanner scanner =  new Scanner (System.in);
		n = scanner.nextInt();
		int[] reader = new int[n];
		for(int i = 0; i<n; i++ ){
			reader[i] = scanner.nextInt();
			if(reader[i] % 2 !=0){
				counter++;
			}	
		}
		System.out.print(counter);
		

	}

}
