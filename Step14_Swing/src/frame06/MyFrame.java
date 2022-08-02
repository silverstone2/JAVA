package frame06;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	// 생성자
	public MyFrame(String title) {
		// 부모생성자에 프레임의 제목 넘겨주기
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		// 프레임에 버튼 추가하기(FlowLayout의 영향을 받는다)
		add(sendBtn);
		sendBtn.addActionListener(this); // this를 쓸때에는 반드시 클래스명을 명시해줘야 함
		// 이렇게 위에처럼 implements까지 다 해주면 Override 구역에서 실행이 된다.
		
		// 삭제 버튼을 만들어서
		JButton deleteBtn = new JButton("삭제");
		// 프레임에 추가하기
		add(deleteBtn);
		deleteBtn.addActionListener(this);
	}
		
	
	
	public static void main(String[] args) {
		
		JFrame f = new MyFrame("나의 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("전송")) {
			JOptionPane.showMessageDialog(this, "전송합니다!");
		} else if(action.equals("삭제")) {
			JOptionPane.showMessageDialog(this, "삭제합니다!");
		}
	}
}
