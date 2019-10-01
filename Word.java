package learnD;

public class Word 
{
	private String german = ""; // type "ARTICLE {german word}-die{plural german word}
	private String russian = ""; // type "{russian word}-{plural russian word}
	private String conjugation = "";
	private boolean isLearned = false;
	
	public void setGerman(String german)
	{
		this.german = german;
	}
	public void setRussian(String russian)
	{
		this.russian = russian;
	}
	public void setConjugation(String conjugation)
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
	public String getConjugation()
	{
		return conjugation;
	}
	public boolean isLearned()
	{
		return isLearned;
	}
	
}