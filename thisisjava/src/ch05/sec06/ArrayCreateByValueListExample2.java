package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//배열을 매게값으로주고, printItem 메소드 호출
		printItem( new int[] {83, 90, 87} );
	}
	//printItem 메소드 선언
	public static void printItem( int[] scores ) {
		for (int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
			
		}

	}

}
