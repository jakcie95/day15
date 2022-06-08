package day15;
class A01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class Ex01 {
public static void main(String[] args) {
	A01 a = new A01();
	B01 b = new B01();
	//a에 대한 기능이 끝나야 b를 실행
	//thread 사용시 스레드가 있는 클래스를 동시 반복적으로 실행
	//작업 속도가 빨라짐
	//a.run();
	//b.run();
	//메인이 끝나면 다른 스레드도 종료
	a.setDaemon(true);
	b.setDaemon(true);
	
	a.start();
	b.start();
	
	System.out.println("프로그램 종료");
	System.out.println("프로그램 종료");
	System.out.println("프로그램 종료");
	System.out.println("프로그램 종료");
}
}
