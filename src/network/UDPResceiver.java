package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.channels.DatagramChannel;

public class UDPResceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7100);
		System.out.println("Receive socket start");
		System.out.println("Receive ready");
		
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		
		System.out.println("Receive data : " + new String(data));
		socket.close();
	}

}
