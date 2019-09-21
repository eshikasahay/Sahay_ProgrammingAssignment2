import java.util.Scanner;

public class Encryption 
{

	public static void main(String[] args) 
	{
		int n, a, b, c, d;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a four-digit number");
	    n = sc.nextInt();
	    
	    d = n%10;
	    n = n/10;
	    c = n%10;
	    n = n/10;
	    b = n%10;
	    n = n/10;
	    a = n%10;

	    a = (a+7)%10;
	    b = (b+7)%10;
	    c = (c+7)%10;
	    d = (d+7)%10;

	    System.out.println("Encrypted: "+c+d+a+b);
	}

}
