package Server;

public class Box<T> {
	private T t;
	
	public void set(T newT) {
		this.t= newT;	
		}
	
	public T getT() {
		return t;
	}
	
	public static<T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
}
