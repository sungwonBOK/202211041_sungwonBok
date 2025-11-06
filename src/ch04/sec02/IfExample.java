package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score>=90) {
			System.out.println("점수가 90보다높다");
			System.out.println("등급은 a입니다");
		}
		
		if (score<90)
			System.out.println("점수가 90보다 작다");
			System.out.println("등급은 B");
	}

}
