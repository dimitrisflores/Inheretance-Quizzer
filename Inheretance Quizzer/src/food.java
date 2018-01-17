
public class food
	{
		private int number = 7;
		public food(int x)
			{
			number = x;
			System.out.println("You have " + x + "grapes to eat");
			}
		public int grab()
			{
			return get();
			}
		public void set(int y)
			{
			number = y;
			}
		public int get()
			{
			return number;
			}	
	}

