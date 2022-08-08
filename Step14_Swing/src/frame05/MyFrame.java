package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	
	// 생성자
	public MyFrame(String title) {
		// 부모생성자에 프레임의 제목 넘겨주기
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		
		// 프레임에 버튼 추가하기(FlowLayout의 영향을 받음)
		add(sendBtn);
		
		// 버튼의 동작을 리스닝할 interface type 객체
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("오잉 전송?");
				/*
				 * 	JOptionPane 클래스의 static 메소드를 호출해서 메세지 다이얼로그 띄우기
				 * 
				 * 	.showMessageDialog(프레임의 참조값, 띄울 메세지)
				 */
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
				// MyFrame.this -> 저 클래스로 생성된(바깥쪽으로 싸고 있는 클래스로 생성된) 참조값
				// 만약 그냥 this라고 쓰게 되면 ActionListener를 지칭하게 되는 것임
				// 자바는 똑같은 메소드가 여러개 종류가 있지만 용도별로 다 다르다.(생성자와 마찬가지로 다중 정의 되어 있을 수도 있다)
				//static method는 클래스에 . 찍어서 사용 !
			}
		};
		sendBtn.addActionListener(listener);
		
		// 삭제 버튼을 만들어서
		JButton deleteBtn = new JButton("삭제");
		// 프레임에 추가하기
		add(deleteBtn);
		/*
		 * 	지역변수를 안 만들고 할 수는 없을까?
		 * 	
		 * 	추상메소드가 하나니깐 함수 형태로 만들 수는 없을까?
		 */
//		deleteBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(MyFrame.this,  "삭제합니다");
//			}
//		});
		
		deleteBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(MyFrame.this,  "삭제합니다");
		});
	}
	
	
	public static void main(String[] args) {
		
		JFrame f = new MyFrame("나의 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
