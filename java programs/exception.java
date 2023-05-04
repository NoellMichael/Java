//36. NOELL BIJU MICHAEL
class exception
{
	public static void main(String args[])
	{
		try{
			System.out.println("Try block");
			int a = 10/5;
			System.out.println("result: "+a);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block");
			System.out.println("no exception");
		}
	}
}
