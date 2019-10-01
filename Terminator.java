package learnD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// This class has to terminate processes by executable name/application title
// Also has to check every second whether the targeted process had been opened and kill it in case of that
public class Terminator 
{
	public Terminator(List<String> targetedProcesses)
	{
		Thread processKiller = new Thread(() ->{
			while (true)
			{
				try 
				{
					for(int i = 0; i < targetedProcesses.size(); ++i)
					{
						if (isProcessRunning(targetedProcesses.get(i)))
							terminateByExeName(targetedProcesses.get(i));
					}
					Thread.sleep(7500);
				
				
				} catch (IOException e1) {
					System.out.println("Couldnt terminate the process");
					e1.printStackTrace();
				} catch (InterruptedException e) {
					System.out.println("Couldnt sleep thread");
					e.printStackTrace();
				}
			}
		});
		processKiller.start();
	}
	
	public boolean isProcessRunning(String executableName) throws IOException
	{
		String line;
		String pidInfo ="";

		Process process= Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");

		BufferedReader input =  new BufferedReader(new InputStreamReader(process.getInputStream()));

		while ((line = input.readLine()) != null) {
		    pidInfo+=line; 
		}
		
		input.close();
		
		if (pidInfo.contains(executableName))
			return true;
		else
			return false;
	}
	
	public void terminateByExeName(String executableName) throws IOException
	{
		Runtime.getRuntime().exec("taskkill /F /IM " + executableName);
	}
}
