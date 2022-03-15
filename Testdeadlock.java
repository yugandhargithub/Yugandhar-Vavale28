package ThreadExample;

public class Testdeadlock {

	public static void main(String[] args) {
		
		String resource1="paper";
		String resource2="pen";
		
		Thread yugandhar = new Thread()
		{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread 1-yugandhar:locked paper");
					try
					{
						Thread.sleep(400);
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
					
					synchronized(resource2)
					{
						System.out.println("Thread 1:locked pen");
					}	
				}
			}
		};
		
		Thread pradeep = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 2-pradeep:locked pen");
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				synchronized(resource2)
				{
					System.out.println("Thread 2:locked paper");
				}
			}//run
		};//monalisa	
		
		yugandhar.start();
		pradeep.start();
	}

}
