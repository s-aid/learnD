package learnD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Idea:
 * 1) dont let play cs / minecraft / etc until you are not done with remembering 100% of german words
 * 2) need a keyboard with special symbols (umlaut)
*/


public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		List<String> restrictedProcesses = new ArrayList<String>();
		restrictedProcesses.add("csgo.exe");
		
		Terminator terminator = new Terminator(restrictedProcesses);
		Conjugation con = new Conjugation("brauchen");
		System.out.println(con.toString());
		Conjugation con2 = new Conjugation();
		con2.parseFromString(con.toString());
		System.out.println(con2.toString());
	}
}
