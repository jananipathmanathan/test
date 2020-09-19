import java.util.Scanner;
public class FirstPro
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you hungry?");
		String ans = sc.nextLine();
		if(ans.equals("Y") || ans.equals("y"))
		{
			System.out.println("Eat samosa");
			System.out.println("Eat pizza");
		}
		if(ans.equals("N") || ans.equals("n"))
		{
			System.out.println("Do your Homework");
		}
	}
}