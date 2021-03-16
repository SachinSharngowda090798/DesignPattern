
public class ABC {

	static ABC obj =new ABC();
	
	private ABC()
	{
		
	}
	
	public static ABC getInstance()
	{
		 return obj;
	}
	

}

class Main1 {

	public static void main(String[] args) {
	
		ABC obj1=ABC.getInstance();
		
		ABC obj2=ABC.getInstance();
		System.out.println("obj1 : " + obj1);
		 System.out.println("obj2 : " + obj2);
		
		System.out.println((obj1.equals(obj2)));
			
	}

}