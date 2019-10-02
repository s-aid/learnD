package learnD;

public class Word 
{
	private String german = ""; // type "ARTICLE {german word}-die{plural german word}
	private String russian = ""; // type "{russian word}-{plural russian word}
	private Conjugation conjugation = null;
	private boolean isLearned = false;
	
	public void setGerman(String german)
	{
		this.german = german;
	}
	public void setRussian(String russian)
	{
		this.russian = russian;
	}
	public void setConjugation(Conjugation conjugation)
	{
		this.conjugation = conjugation;
	}
	public void setLearnedStatus(boolean isLearned)
	{
		this.isLearned = isLearned;
	}
	
	public String getGerman()
	{
		return german;
	}
	public String getRussian()
	{
		return russian;
	}
	public Conjugation getConjugation()
	{
		return conjugation;
	}
	public boolean isLearned()
	{
		return isLearned;
	}
	
	public String toString()
	{
		String result = german + "'"  + russian + "'";
		
		if (conjugation == null)
			result += "'";
		else
			result += conjugation.toString() + "'";
		result += (isLearned ? "1" : "0");
		
		return result;
	}
	public void parseFromString(String toParse) throws Exception
	{
		String[] parts = toParse.split("'");
		
		german = parts[0];
		russian = parts[1];
		
		if (!parts[2].isEmpty())
			conjugation.parseFromString(parts[2]);
		
		isLearned = parts[3] == "1" ? true : false;
	}
}
