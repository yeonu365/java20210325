package p06.lecture.p4method;

public class MyClass8 {
	int max(int... i) {
		if (i.length == 0) {
			return 0;
		}

		int res;
		res = Integer.MIN_VALUE;

		for (int k = 0; k < i.length; k++) {
			if (res < i[k]) {
				res = i[k];
			}
		}
		return res;
	}
}
