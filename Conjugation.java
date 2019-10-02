package learnD;

public class Conjugation 
{
	String ich = "";
	String du = "";
	String er = "";
	
	String wir = "";
	String ihr = "";
	String Sie = "";
	
	public Conjugation(String verb)
	{
		wir = verb;
		Sie = verb;
		// Remove -en (-n)
		if (verb.charAt(verb.length() - 1) == 'n')
		{
			verb = verb.substring(0, verb.length() - 1);
			System.out.println(verb);
			if (verb.charAt(verb.length() - 1) == 'e')
			{
				verb = verb.substring(0, verb.length() - 1);
				System.out.println(verb);
			}
		}
		
		// Conjugate :)
		ich = verb + 'e';
		du = verb + "st";
		er = verb + 't';
		ihr = verb + 't';
	}
	public Conjugation()
	{
		
	}
	
	public void setIch(String ich)
	{
		this.ich = ich;
	}
	public void setDu(String du) 
	{
		this.du = du;
	}
	public void setEr(String er)
	{
		this.er = er;
	}
	public void setWir(String wir)
	{
		this.wir = wir;
	}
	public void setIhr(String ihr)
	{
		this.ihr = ihr;
	}
	public void setSie(String Sie)
	{
		this.Sie = Sie;
	}
	
	public String getIch()
	{
		return ich;
	}
	public String getDu()
	{
		return du;
	}
	public String getEr()
	{
		return er;
	}
	public String getWir()
	{
		return wir;
	}
	public String getIhr()
	{
		return ihr;
	}
	public String getSie()
	{
		return Sie;
	}
	
	public String toString() 
	{
		// Format: <ich>,<du>,<er/sie/es>,<wir>,<ihr>,<Sie>
		if (ich == "")
			return "";
		return ich + ',' + du + ',' + er + ',' + wir + ',' + ihr + ',' + Sie + '.';
	}
	public void parseFromString(String toParse) throws Exception
	{
		toParse = toParse.substring(0, toParse.length() - 1);
		String[] parts = toParse.split(",");
		
		ich = parts[0];
		du = parts[1];
		er = parts[2];
		wir = parts[3];
		ihr = parts[4];
		Sie = parts[5];
	}
}
