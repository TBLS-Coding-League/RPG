package brooklynlatin.codingleague.rpg.engine;

public class Input {
	public void handleMovement()
	{
		try 
		{if(Draw.getInstance().SpaceKey)
		{
			System.out.println("Space Key Pressed");
			Draw.getInstance().WindowR = 1.0f;
			Draw.getInstance().WindowG = 0.0f;
			Draw.getInstance().WindowB = 0.0f;
			Draw.getInstance().WindowA = 0.0f;
			Thread.sleep(500);
			Draw.getInstance().WindowR = 0.0f;
			Draw.getInstance().WindowG = 0.0f;
			Draw.getInstance().WindowB = 0.0f;
			Draw.getInstance().WindowA = 0.0f;
		}
		}
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
}