package quiz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizJFrame extends Thread{
	public void run() {
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
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		for(int i=0; ; i++) {
			String result = null;
			Date d = new Date();
			result = simple.format(d);
		label.setText(result+"");
	}
	

}
}