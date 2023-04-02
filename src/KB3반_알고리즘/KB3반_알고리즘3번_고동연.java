package KB3반_알고리즘;

import java.util.Iterator;
import java.util.Scanner;

public class KB3반_알고리즘3번_고동연 {

	public static void main(String[] args) {
		//오목 정보 저장 2차원 배열
		int [][] mineMap=new int[19][19];
		Scanner sc=new Scanner(System.in);
		
		
		for (int i = 0; i < mineMap.length; i++) {
			for (int j = 0; j < mineMap.length; j++) {
				mineMap[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			if(mineMap==1)
			int x=r.nextInt(10)+1;
			int y=r.nextInt(10)+1;
			mineMap[x][y]=9;
			
			mineMap[x-1][y]++;// 상
			mineMap[x-1][y+1]++;// 상우
			mineMap[x][y+1]++;// 우
			mineMap[x+1][y+1]++;// 우하
			mineMap[x+1][y]++;// 하
			mineMap[x+1][y-1]++;// 좌하
			mineMap[x][y-1]++;// 좌
			mineMap[x-1][y-1]++;// 좌상
		}

	}

}
