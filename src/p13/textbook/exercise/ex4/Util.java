package p13.textbook.exercise.ex4;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K String) {
		K key = pair.getKey();
		
		if (key.equals(String)) {
		return pair.getValue();
	}
		return null;
	}
}
