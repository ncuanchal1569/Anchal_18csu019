public interface Doable
{
	public static final String NAME;
	public void doThis();
	public int doThat();
	public void doThis2(float value,char ch);
	public boolean doTheOter(int num);
	public class  Something implements Doable
	{
		public void doThis()
		{
			//whatever
		}
		public void doThat()
        {
        	//whatever
        }
        //etc
	}
}