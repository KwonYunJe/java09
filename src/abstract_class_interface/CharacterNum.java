package abstract_class_interface;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CharacterNum {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		j.setSize(600, 600);
		j.getContentPane().setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(66, 174, 463, 297);
		j.getContentPane().add(ta);
		
		JLabel lblNewLabel = new JLabel("Character : ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(66, 37, 150, 45);
		j.getContentPane().add(lblNewLabel);
		
		JLabel lblWords = new JLabel("Words : ");
		lblWords.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblWords.setBounds(66, 94, 135, 45);
		j.getContentPane().add(lblWords);
		
		JLabel cn = new JLabel("");
		cn.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		cn.setBounds(213, 37, 316, 45);
		j.getContentPane().add(cn);
		
		JLabel wn = new JLabel("");
		wn.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		wn.setBounds(223, 94, 306, 45);
		j.getContentPane().add(wn);
		
		JButton c = new JButton("Click");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		c.setBounds(66, 492, 132, 58);
		j.getContentPane().add(c);
		
		JButton pc = new JButton("Text Color");
		pc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setForeground(Color.WHITE);
			}
		});
		pc.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		pc.setBounds(397, 492, 132, 58);
		j.getContentPane().add(pc);
		
		JButton tc = new JButton("Pad Color");
		tc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ta.setBackground(Color.DARK_GRAY);
				
			}
		});
		tc.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		tc.setBounds(230, 492, 132, 58);
		j.getContentPane().add(tc);
		
		
		
		
		j.setVisible(true);
	}
}
