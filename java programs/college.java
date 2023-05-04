class college{
	void showBranches(){
		System.out.println("Branches:\n");
		System.out.println("1.Mechanical engineering\n 2.Automobile engineering\n 3.Computer science engineering\n 4.IT engineering\n 5.Food technology");
	}
}
class BranchCSE extends college{
	void showSubjects(){
		System.out.println("Subjects:\n");
		System.out.println("1.DMS\n 2.LSD\n 3.OOP\n 4.DS\n 5.SE");
	}
}
class clgbranchsubj{
	public static void main(String args[])
	{
		BranchCSE clg = new BranchCSE();
		clg.showBranches();
		clg.showSubjects();
	}
}