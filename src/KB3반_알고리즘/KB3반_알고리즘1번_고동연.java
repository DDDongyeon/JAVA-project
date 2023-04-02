package KB3반_알고리즘;

import java.util.Scanner;

public class KB3반_알고리즘1번_고동연 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			for (int i = n-1; i >=0; i--) {
				int min=i;
				for (int j = i-1; j >= 0; j--) {
					if(arr[j]<arr[min]) {
						min=j;
					}
				}
				int temp=0;
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;	
			}//end for
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}


