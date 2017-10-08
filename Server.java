import java.io.*;
import java.net.*;


public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server s= new Server();
		s.run();
	}
	public void run() throws Exception{
		//Create server socket on port 444
		ServerSocket srvsock = new ServerSocket(4444);
		//Create plain socket to accept from server socket
		Socket sock=srvsock.accept();
		//Input stream from socket
		InputStreamReader IR= new InputStreamReader(sock.getInputStream());
		BufferedReader BR = new BufferedReader(IR);
		
		String message= BR.readLine();
		//Received from client
		System.out.println(message);
		
		//Will be sent to client
		if(message!=null){
			PrintStream ps = new PrintStream(sock.getOutputStream());
			ps.println("Hello from the other end!");
		}
		
	}

}
