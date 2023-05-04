package mypack;
abstract class Triangle{
    abstract void checkTriangle(int a, int b, int c);
    abstract void Area(int a, int b, int c);
}
public class TriangleImpl extends Triangle{
    float s;
    double area;
    public void checkTriangle(int a, int b, int c){
        if(a*a == (b*b + c*c)){
            System.out.println("Triangle is a right angled triangle.");
        }
        else{
            System.out.println("Triangle is not a right angled triangle.");
        }
    }
    public void Area(int a, int b, int c){
        s = (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is: " + area);
    }
}