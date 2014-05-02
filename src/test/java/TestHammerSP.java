import static org.junit.Assert.*;

import org.junit.Test;


public class TestHammerSP {

	
	@Test
	public void CheckResultHammerScissorsReturnPlayer1Win(){
		assertEquals("Check result", "Player1",new GameTest().powYingChub("H","S"));
	}
	
	@Test
	public void CheckResultHammerHammerReturnPlayerDraw(){
		assertEquals("Check result", "Draw",new GameTest().powYingChub("H","H"));
	}
	
	@Test
	public void CheckResultHammerPaperReturnPlayer2Win(){
		assertEquals("Check result", "Player2",new GameTest().powYingChub("H","P"));
	}
}
