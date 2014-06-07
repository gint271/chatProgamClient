package chatProgramClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatProgramClient {

	public static void main(String[] args) 
	{
		ChatFrame frame = null;
		Socket server = null;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String username = null;
		
		System.out.println("What is your username?" );
		try
		{
			username = keyboard.readLine();
		}
		catch (Exception e)
		{
			System.out.println("Failed to read username.");
			System.exit(2);
		}
		
		System.out.println("Enter the IP address or hostname of the server.");
		try
		{
			server = new Socket(keyboard.readLine(), 1201);
		}
		catch (Exception e)
		{
			System.out.println("Failed to connect to server.");
			System.exit(2);
		}
		
		try 
		{
			frame = new ChatFrame(server, username);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//Begins the input and output threads.
		//new Thread(new writeThread(newSocket, frame)).start();
		new Thread(new readThread(server, frame)).start();

	}

}
