/**
 * 
 * @author jeremy
 *
 */
public class DiceClass
{
	private int rolls;
	
	public DiceClass()
	{
		rolls = 0;
	}

	public int roll()
	{
		rolls++;
		int roll = (int)(Math.random() * 6) + 1;
		return roll;
	}
	
	public void reset()
	{
		
		rolls = 0;
	}
	
	public int getNumRolls()
	{
		return rolls;
	}
}
