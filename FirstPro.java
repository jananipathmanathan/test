import java.util.Scanner;
public class FirstPro
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter 3 numbers");
		int ans = sc.nextInt();
		for(int i = 1; i<=3; i++)
		{
			sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}
}