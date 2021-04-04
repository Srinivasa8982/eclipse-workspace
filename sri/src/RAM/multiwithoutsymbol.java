package RAM;

import java.util.Scanner;

public class multiwithoutsymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in); 
		int a=s.nextInt(); 
		int b=s.nextInt(); 
		int sum=0; 
		while(b!=0) 
		{ 
			if(b%2!=0) 
				sum+=a; 
			a=a<<1; 
			b=b>>1; 
		} 
		System.out.println(sum); 

	}

}
