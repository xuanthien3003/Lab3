package bai1;

import java.util.Scanner;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Số nguyên cần kiểm tra:");
		int N=scanner.nextInt();
		boolean ok = true;
		for(int i=2; i < N-1; i++){ 
		if(N % i == 0){
		ok = false;
		break;
		}
		i++;
		}
	
		if(ok==true)
			{
				System.out.print("Là số nguyên tố");
			}
		else 
			System.out.print("Không là số nguyên tố");
		}
			
}