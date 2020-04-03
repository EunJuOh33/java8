package Day0403;

public class Util {
	public static <T> Box2<T> boxing(T t) {
		Box2<T> box = new Box2<>();
		box.set(t);
		return box;
	}
	
		public static <T extends Number> int compare(T t1, T t2) {	//extends최상위 클래스를 설정할 때 사용
			double v1 = t1.doubleValue();
			//System.out.println(t1.getClass().getName());
			double v2 = t2.doubleValue();
			//System.out.println(t2.getClass().getName());
			return Double.compare(v1, v2);
	}
}
