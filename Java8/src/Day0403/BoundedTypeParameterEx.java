package Day0403;
public class BoundedTypeParameterEx {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (x)
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);	
		}
}
