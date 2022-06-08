package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
public static void main(String[] args) throws Exception, IOException {
	Socket sock = 
			new Socket("192.168.7.122", 12345);//컴퓨터 ip
	OutputStream os = sock.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	
	
	Scanner sc = new Scanner(System.in);
	/*
	int sendData;
	System.out.println("숫자 입력");
	sendData = sc.nextInt();
	os.write(sendData);
	*/
	
	System.out.println("데이터 입력");
	String sendData = sc.next();
	dos.writeUTF(sendData);
	System.out.println("데이터를 전송하였습니다.");
	
	InputStream in = sock.getInputStream();
	DataInputStream dis = new DataInputStream(in);
	
	System.out.println("수신 데이터 : " + dis.readUTF());
	System.out.println("클라이언트 종료");
	
	
}
}
