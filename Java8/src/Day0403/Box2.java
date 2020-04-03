package Day0403;

public class Box2<T> {	//제네릭은 타입매개변
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
