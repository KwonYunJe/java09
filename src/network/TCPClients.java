package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class TCPClients {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 100; i++) {
			Socket socket = new Socket("localhost", 9200);
			System.out.println("Client Connect " + i );
			
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer2.readLine();
			System.out.println("Data by server : " + data);
		}
	}

}
