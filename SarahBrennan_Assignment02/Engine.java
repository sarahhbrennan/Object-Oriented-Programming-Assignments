//Sarah Brennan 2962279
public class Engine {
		private int cc;
		
		public Engine (int c)
		{
			cc = c;
		}
		
		public int get()
		{
			return cc;
		}
		
		public void edit(int c)
		{
			cc = c;
		}
		public String toString()
		{
			return "CC: "+cc;
		}

}
