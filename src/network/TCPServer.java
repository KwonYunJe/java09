package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9200);
		System.out.println("ServerSocket Start");
		System.out.println("Wait for client request");
		int count = 0;
		
		while(true) {
			Socket socket = server.accept();
			count ++ ;
			System.out.println("Client Connect");
			System.out.println("Client Connecting : " + count);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String date = String.valueOf(new Date());
			out.print(date);
			out.close();
			socket.close();
		}
	}

}
