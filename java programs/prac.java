import java.util.Scanner;
public class prac
{
	public static void main(String args[])
	{
		Scanner fr = new Scanner(System.in);

		System.out.println("enter a string: ");
		String str = fr.nextLine();
		System.out.println("enter a character to check its frequency: ");
		char ch = fr.next().charAt(0);

		int frequency = 0;

		for (int i=0;i<str.length() ;i++ ) {
			if(ch==str.charAt(i)){
				frequency++;
			}
		}
		System.out.println("frequency of " + ch + " is " +frequency);
	}
}