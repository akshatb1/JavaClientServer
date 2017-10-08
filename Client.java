import java.io.*;
import java.net.*;


public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Client c= new Client();
		c.run();
	}
	public void run() throws Exception{
		
		//Create plain socket to accept from server socket
		Socket sock=new Socket("localhost",4444);
		PrintStream PS = new PrintStream(sock.getOutputStream());
		PS.println("Hello to server from the client");
		
		InputStreamReader IR= new InputStreamReader(sock.getInputStream());
		BufferedReader BR= new BufferedReader(IR);
		
		String message=BR.readLine();
		System.out.println(message);
		
		
		
	}

}
