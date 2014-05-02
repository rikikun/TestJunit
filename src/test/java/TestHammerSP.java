import static org.junit.Assert.*;

import org.junit.Test;


public class TestHammerSP {

	
	@Test
	public void checkResultHammerScissorsReturnPlayer1Win(){
		assertEquals("Check result", "Player1",new GameTest().powYingChub("H","S"));
	}
	
	@Test
	public void checkResultHammerHammerReturnPlayerDraw(){
		assertEquals("Check result", "Draw",new GameTest().powYingChub("H","H"));
	}
	
	@Test
	public void checkResultHammerPaperReturnPlayer2Win(){
		assertEquals("Check result", "Player2",new GameTest().powYingChub("H","P"));
	}
	
	@Test
	public void checkResultPaperScissorsReturnPlayer2Win(){
		assertEquals("Check result", "Player2",new GameTest().powYingChub("P","S"));
	}
	
	@Test
	public void checkResultScissorsHammerReturnPlayer2Win(){
		assertEquals("Check result", "Player2",new GameTest().powYingChub("S","H"));
	}
	
	
	
}
