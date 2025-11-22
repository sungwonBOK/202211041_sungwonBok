package week13;

import java.util.Scanner;

public class BankApplication {
    // 계좌 객체를 저장할 배열 (길이 100)
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            // nextLine()으로 받고 정수로 변환 (문제 요구사항 반영 및 버퍼 문제 방지)
            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 1. 계좌생성하기
    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano, owner, balance);

        // 배열의 빈 곳(null)을 찾아 객체 저장
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 2. 계좌목록보기
    private static void accountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno());
                System.out.print("     ");
                System.out.print(account.getOwner());
                System.out.print("     ");
                System.out.println(account.getBalance());
            }
        }
    }

    // 3. 예금하기
    private static void deposit() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 입금이 성공되었습니다."); // 문제에는 없지만 흐름상 추가됨, 생략 가능
    }

    // 4. 출금하기
    private static void withdraw() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // 계좌번호로 계좌 찾기 (유틸리티 메소드)
    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }
}