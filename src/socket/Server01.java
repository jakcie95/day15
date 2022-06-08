package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server01 {
public static void main(String[] args) throws IOException {
	ServerSocket server = new ServerSocket(12345);
	System.out.println("접속을 기다립니다");
	Socket sock = 
			server.accept(); // 변수에 클라이언트 정보가 저장됨
	//System.out.println("접속 되었습니다");
	InputStream in = sock.getInputStream();
	DataInputStream dis = new DataInputStream(in); // 문자열 송수신
	
	System.out.println("수신 대기...");
	String readData = dis.readUTF();
	System.out.println("수신 데이터 : "+readData);
	
	OutputStream os = sock.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	System.out.println("서버에서 입력");
	str = sc.next();
	dos.writeUTF(str);
	System.out.println("서버 종료");
	
	//int readData = in.read();
	//System.out.println("수신 데이터 : "+readData);
	
}
}
