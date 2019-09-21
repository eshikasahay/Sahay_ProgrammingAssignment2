import java.util.Scanner;

public class Decryption 
{

	public static void main(String[] args) 
	{
		int n, a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the encrypted four-digit number");
		n = sc.nextInt();
		
		d = n%10;
	    n = n/10;
	    c = n%10;
	    n = n/10;
	    b = n%10;
	    n = n/10;
	    a = n%10;
	    
	    a = (a-7+10)%10;
	    b = (b-7+10)%10;
	    c = (c-7+10)%10;
	    d = (d-7+10)%10;
	    
	    System.out.println("Decrypted: "+c+d+a+b);
	}

}
