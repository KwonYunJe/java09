package abstract_class_interface;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import abstract_class_interface.Button2Active;
import abstract_class_interface.Button1Active;

public class ButtonActiveEvent {
	static TextArea list;
	static JButton b1, b2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Push me");
		JButton b2 = new JButton("Push me too");
		
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		Button1Active button1 = new Button1Active();
		b1.addActionListener(button1);
		Button2Active button2 = new Button2Active();
		b2.addActionListener(button2);
		
		list = new TextArea(6,13);
		list.setFont(font);
		f.add(list);
		
		f.setVisible(true);
	}

}
