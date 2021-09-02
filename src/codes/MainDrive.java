package codes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

//		정보들을 한 줄로 모아주자(가공해주자) -> "이름,폰번,연도" 형태로
		String content = String.format("%s, %s, %d", name, phoneNum, birthYear);

//		System.out.println(content);

		savePhoneNumToFile(content);

	}

	// 가공된 한 줄을 파일에 추가해주는 함수
	static void savePhoneNumToFile(String content) {
		// 완성된 한 줄을 myPhoneBook.csv 파일에 저장하자

		File myFile = new File("myPhoneBook.csv");

//		저장된 파일에 데이터 작성을 해주는 클래스
		try {
//			생성자의 두번째 파라미터 : 이어붙이기가 맞다(true넣자)(기존 내용 보존O)
			FileWriter fw = new FileWriter(myFile, true);

//			FileWriter는 2byte씩 데이터 처리 -> 한 글자씩 적는다
//			한 문장씩 적게 하는게 편하다. 보조 도구 활용
			BufferedWriter bw = new BufferedWriter(fw);

//			보조도구로, 저장할 내용을 한 번에 한 줄 저장
			bw.append(content);
			bw.newLine();

//			다른 경우에도 파일에 접근할 수 있게 사용이 끝나면 닫아주자
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
//모든 목록 조회하는 함수
	static void showAllPhoneNum() {

//		ArrayList로 사용자 데이터 UserData 목록을 담아두자
//		UserData클래스를 추가해주자
		
		
	}

}
