package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame{
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public ChatB() throws Exception{
		socket = new DatagramSocket(5555);
		setTitle("Chat A");
		setSize(500,500);
		
		list = new JTextArea();
		
		input = new JTextField();
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		
		list.setBackground(Color.green);
		input.setBackground(Color.yellow);
		
		list.setForeground(Color.BLUE);
		input.setForeground(Color.red);
		list.setEditable(false);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				
				list.append("상대 : " + data + "\n");
				input.setText("");
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					
					byte[] buf = data.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					int port = 7777;
					DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, port);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		setVisible(true);
	}
	public void process() throws Exception{
		while(true) {
			byte[] buf = new byte[256];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			socket.receive(packet);
			list.append("나 : " + new String(buf) + "\n");
			
		}
	}
	
	public static void main(String[] args) throws Exception{
		ChatA m = new ChatA();
		m.process();
	}
}
