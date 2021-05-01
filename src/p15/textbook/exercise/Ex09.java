package p15.textbook.exercise;

import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name =null;
		int maxScore = 0;
		int totalScore =0;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
			totalScore += value;
		}
		
		
		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
