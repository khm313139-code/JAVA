package windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//awt로 아이디 및 패스워드를 검토 프로세서 만들기
public class awt_login {

	public static void main(String[] args) {
		new client_login();

	}

}

class client_login{
	Frame f = null;
	TextField mid = null;
	TextField mpass = null;
	Button btn = null;
	Label msg = null; //결과값을 출력하기 위함
	
	public client_login() {
		this.f = new Frame();
		this.f.setTitle("ERP 로그인");
		this.f.setSize(450,200); // Label 표시 공간 확보
		this.f.setLayout(null);
		
		// ID 입력창
		this.mid = new TextField();
        this.mid.setBounds(50, 40, 120, 25);
		
		// PW 입력창
		this.mpass = new TextField();
		this.mpass.setBounds(180, 40, 120, 25);
		this.mpass.setEchoChar('*');
		
		// 로그인 버튼
		this.btn = new Button("로그인");
		this.btn.setBounds(310, 40, 70, 25);
		
		// Label 생성 후 프레임에 추가
		this.msg = new Label();
		this.msg.setBounds(20, 100, 400, 30);
		this.f.add(this.msg);

		this.f.add(this.mid);
		this.f.add(this.mpass);
		this.f.add(this.btn);
		
		this.btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = mid.getText();
				String pw = mpass.getText();
				if(id.equals("")||pw.equals("")) {
					msg.setText("아이디 및 패스워드를 입력하세요");
				}
				else if(id.equals("hong")&&pw.equals("a1234")) {
					msg.setText("로그인 되었습니다.");
				}
				else {
					msg.setText("회원정보가 확인 되지 않음.");
				}
			}
		});
		
		this.f.setVisible(true);

		// -----------------------------------------
		// X 버튼 눌렀을 때 창 닫기 기능
		// -----------------------------------------
		this.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// -----------------------------------------
		// 로그인 버튼 눌렀을 때 창 닫기 기능
		// -----------------------------------------
		// ⛔ 여기서 창 닫히던 부분 제거함
		/*
		this.btn.addActionListener(e -> {
			this.f.dispose();  // 현재 창 닫기
		});
		*/
	}
	
	public void user_login() {
		// 기존 mid, mpass를 다시 만들지 않음 (중복 제거)
		// 이미 생성된 컴포넌트를 재배치만 가능
		
		this.mid.setBounds(20,40,400,30);
		this.mpass.setBounds(20,70,400,30);
	}
}


