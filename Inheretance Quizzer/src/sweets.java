
public class sweets extends food
	{
		private int numberTwo = 17;
		public sweets(int x)
			{
			super(x);
			numberTwo = x;
			System.out.println("Cake is amazing!");
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
