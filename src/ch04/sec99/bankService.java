package ch04.sec99;

import java.util.Scanner;

public class bankService {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		
		while(run) {
			System.out.println("--------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				String inputMoney = scanner.nextLine();
				money += Integer.parseInt(inputMoney);
				
				System.out.println("예금액: " + Integer.parseInt(inputMoney));
				System.out.println("현재 금액: " + money);
				
				
			} else if (strNum.equals("2")) {
				String outputMoney = scanner.nextLine();
				money -= Integer.parseInt(outputMoney);
				System.out.println("출금액: " + Integer.parseInt(outputMoney));
				System.out.println("현재 금액=" + money);
			} else if (strNum.equals("3")) {
				System.out.println("잔고: " + money);
				
			} else if (strNum.equals("4")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
