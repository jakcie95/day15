package quiz;

import java.util.Scanner;

public class QuizTec extends Thread{
	public int num1;
	public void run() {
	Scanner sc = new Scanner(System.in);
	QuizJFrame jf = new QuizJFrame();
	QuizTec tec = new QuizTec();
		while(true) {
		System.out.println("=== 환영합니다 ===");
		System.out.println("1. 기능");
		System.out.println("2. off");
		System.out.println("입력 >>>>");
		num1 = sc.nextInt();
		if(num1 == 1) {
			jf.setDaemon(true);
			tec.setDaemon(true);
			jf.start();
			tec.start();
			continue;
		}else if(num1 == 2) {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("잘못된 입력입니다.");
			continue;
			}
		}
}
}
