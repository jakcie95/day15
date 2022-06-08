package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class QuizMain extends Thread{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap map = new HashMap();
	QuizUserInfo user = new QuizUserInfo();
	QuizTec tec = new QuizTec();
	QuizJFrame jf = new QuizJFrame();
	int num =0;
	String id, pw = null;
	String inputId = null, inputPw = null;
	System.out.println("===로그인 페이지 ===");
	while(true) {
		System.out.println("1.로그인 2. 가입 3.로그아웃");
		System.out.println(">>>");
		num = sc.nextInt();
		if(num == 1) {
			System.out.println("아이디 입력 : ");
			inputId = sc.next();
			System.out.println("비밀번호 입력 : ");
			inputPw = sc.next();
			if(inputId.equals(user.getId())&&inputPw.equals(user.getPw()))
            {
                System.out.println("로그인 성공");
                tec.run();
            }else{
            	System.out.println("회원가입부터 해주세요");
            	continue;
            }
		}else if(num == 2) {
			while(true) {
				System.out.println("아이디 입력 : ");
				id = sc.next();
				System.out.println("비밀번호 입력 : ");
				pw = sc.next();
				map.put(id, pw);
				user.setId(id);
				user.setPw(pw);
				System.out.println("회원가입이 완료되었습니다");
				break;
			}
			
		}else if(num == 3) {
			System.out.println("로그아웃 되었습니다.");
			System.exit(0);
		}else {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		}
	}
}



