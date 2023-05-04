abstract class shape{
	abstract void numberofsides();
}
class triangle extends shape{
	void numberofsides(){
		System.out.println("Number of sides of a triangle: 3");
	}
}
class rectangle extends shape{
	void numberofsides(){
		System.out.println("Number of sides of a rectangle: 3");
	}
}
class hexagon extends shape{
	void numberofsides(){
		System.out.println("Number of sides of a hexagon: 6");
	}
}
class exp7{
	public static void main(String args[]){
		shape obj1 = new triangle();
		shape obj2 = new rectangle();
		shape obj3 = new hexagon();
		obj1.numberofsides();
		obj2.numberofsides();
		obj3.numberofsides();
	}
}