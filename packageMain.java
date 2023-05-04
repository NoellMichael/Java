import mypack.TriangleImpl;
import java.util.Scanner;
class packageMain{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        TriangleImpl obj = new TriangleImpl();
        System.out.println("Enter the sides in descending order: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        obj.checkTriangle(a, b, c);
        obj.Area(a, b, c);
    }
}