import java.util.Scanner;
class grading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks: \n");
        int mark = sc.nextInt();
        if(mark>90)
        {
            System.out.println("you got A");
        }
        else if(mark>70 && mark<90)
        {
            System.out.println("you got B");
        }
        else if(mark>50 && mark<70)
        {
            System.out.println("you got C");
        }
        else
        System.out.println("you failed");
    }
}