package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;		
	}
	
	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd =128;
	}
		
	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd =128;
	}
	
	Computer(int memory, String model) {
		this.model = model;
		this.memory = memory;
		this.cpu = "yuyu";
		this.ssd =365;
	}
	//YU. 들어오는 파라미터의 순서에 의해 생성자Computer 를 선택하여 실행됨.
	
	/*
	    생성자 타입과 갯수가 동일하여 불가.
	 
	Computer(String model) {
			
	}
	
	Computer(String cpu) {
		
	}
	*/
}
