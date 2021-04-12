package p07.lecture.p2constructor;

public class Sub extends Super {
	
	public Sub(int i) {
		// 상위 class 생성자 호출은 key word 'super' 를 사용!!
//		this.i = i;  <-- 불가 하기 때문에
		super(i);
		
	}
	
	
}
