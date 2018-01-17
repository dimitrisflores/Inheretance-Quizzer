
public class sweets extends food
	{
		private int numberTwo = 17;
		public sweets(int x)
			{
			super(x);
			numberTwo = x;
			}
		public int grab()
			{
			return super.grab();
			}
		public void set(int y)
			{
			numberTwo = y;
			}
		public int get()
			{
			return numberTwo;

			}
	}
