package bai2;

import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i+"x"+j+"="+i*j);
				System.out.println();
			}
		}

	}

}