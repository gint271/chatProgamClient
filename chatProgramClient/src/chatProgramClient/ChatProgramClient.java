package chatProgramClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatProgramClient {

	public static void main(String[] args) 
	{
		Socket server;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the IP address or hostname of the server.");
		try
		{
			server = new Socket(keyboard.readLine(), 1201);
		}
		Catch (Exception e)
		{
			
		}
		

	}

}
