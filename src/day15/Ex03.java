package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {
public static void main(String[] args) {
	JFrame frame = new JFrame("연습");
	Container c = frame.getContentPane();
	JLabel label = new JLabel();
	label.setText("test");
	
	
	Font font = new Font(null, Font.ITALIC, 32);// (글꼴, 폰트, 글씨 크기)
	label.setFont(font);
	label.setHorizontalAlignment(JLabel.CENTER);//글자 가운데로 위치 지정
	
	c.add(label);
	frame.setLocation(1000, 200); // 화면내 위치 지정
	frame.setPreferredSize(new Dimension(500, 200));//사이즈 지정
	frame.pack();
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	for(int i=0; ; i++)
	label.setText(i+"다른내용");
}
}
