package codes;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class MainDrive {
	public static void main(String[] args) {

//	메뉴를 띄우고 -> 입력 받고 -> 종료까지를 별도 함수로 분리 

		printMenu();
	}

	static void printMenu() {
//	0번을 입력할 때까지 메뉴를 계속 출력

//	입력 : Scanner
		Scanner myScanner = new Scanner(System.in);

		while (true) {

			System.out.println("======== 전화번호부 ========");
			System.out.println("1. 전화번호 추가 등록");
			System.out.println("2. 전화번호 목록 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("=========================");
			System.out.println("메뉴 입력 : ");

			int inputMenu = myScanner.nextInt();

			if (inputMenu == 0)// 입력한 숫자가 0이면 반복 탈출
				break;
			else if (inputMenu == 1)
				addPhoneNum();
			else if (inputMenu == 2)
				showAllPhoneNum();
			else {
				System.out.println("잘못된 입력입니다. 메뉴로 돌아갑니다.");

//			2초 정도 프로그램을 정지시키고 그 후 메뉴로 가는 법
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//		1: 추가 등록 기능, 2: 목록 조회 기능, 그 외 : 잘못된 입력

		}

		System.out.println("프로그램을 종료합니다.");
	}

	
//	폰번 추가하는 관련 코드 함수
	static void addPhoneNum() {
//		이름, 폰번, 출생연도를 순서대로 입력 받자
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = myScanner.next();
		
		System.out.println("폰번 입력 : ");
		String phoneNum = myScanner.next();
		
		System.out.println("출생연도 입력 : ");
		int birthYear = myScanner.nextInt();
		
	}

//모든 목록 조회하는 함수
	static void showAllPhoneNum() {

	}

}
