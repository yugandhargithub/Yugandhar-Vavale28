package ThreadExample;

public class TestSleepMethode extends Thread{

	
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			//System.out.println(i);
			System.out.println(Thread.currentThread().getName()+" = "+ i);
		}
	}
	
	
	public static void main(String[] args) {
		TestSleepMethode t1 = new TestSleepMethode();
		TestSleepMethode t2 = new TestSleepMethode();
		TestSleepMethode t3= new TestSleepMethode();
		
		t1.start();
		try {
			t1.join(1500);
		}
		catch (InterruptedException ee){
			System.out.println(ee);
		}//t1.start();//IllegalThreadStateException
		
		t2.start();
		t3.start();
	}

}
