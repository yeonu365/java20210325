package p13.textbook.exercise.ex2;

public class Container<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}