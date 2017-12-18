package sort_matrix2;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the ideal number for line :");
		int line = s.nextInt();

		System.out.println("Enter the ideal number for column :");
		int column = s.nextInt();

		int[][] arry = new int[line][column];

		Methods.Read(arry);
		Methods.BubbleSort(arry);
		Methods.Print(arry);

	}
}

class Methods {

	public static void BubbleSort(int arry[][]) {

		for (int k = 0; k < arry.length; k++)

			for (int i = 0; i < arry[k].length; i++)

				for (int j = 0; j < arry[k].length - 1; j++)

					if (arry[k][j] > arry[k][j + 1]) {

						int temp;

						temp = arry[k][j];
						arry[k][j + 1] = arry[k][j];
						arry[k][j + 1] = temp;

					}
	}

	public static void Read(int arry[][]) {

		Random rand = new Random();

		for (int i = 0; i < arry.length; ++i)

			for (int j = 0; j < arry[i].length; ++j)

				arry[i][j] = rand.nextInt(1000)+1;			
	}

	public static void Print(int arry[][]) {

		for (int i = 0; i < arry.length; ++i) {
			
			for (int j = 0; j < arry[i].length; ++j)
			
				System.out.printf("%d\t", arry[i][j]);
		
			    System.out.println();
		}
	}
}
