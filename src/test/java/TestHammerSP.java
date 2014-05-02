import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class TestHammerSP {

	@Test
	public void checkResultHammerScissorsReturnPlayer1Win() {
		assertEquals("Check result", "Player1",
				new GameTest().powYingChub("H", "S"));
	}

	@Test
	public void checkResultHammerHammerReturnPlayerDraw() {
		assertEquals("Check result", "Draw",
				new GameTest().powYingChub("H", "H"));
	}

	@Test
	public void checkResultHammerPaperReturnPlayer2Win() {
		assertEquals("Check result", "Player2",
				new GameTest().powYingChub("H", "P"));
	}

	@Test
	public void checkResultPaperScissorsReturnPlayer2Win() {
		assertEquals("Check result", "Player2",
				new GameTest().powYingChub("P", "S"));
	}

	@Test
	public void checkResultScissorsHammerReturnPlayer2Win() {
		assertEquals("Check result", "Player2",
				new GameTest().powYingChub("S", "H"));
	}

	@Test
	public void resultScissorsHammerReturnPlayer2Win() {
		PlayerPowYingChub player1 = mock(PlayerPowYingChub.class);
		when(player1.genOutput()).thenReturn("H");
		PlayerPowYingChub player2 = mock(PlayerPowYingChub.class);
		when(player2.genOutput()).thenReturn("P");
		GameTest t = new GameTest();
		t.setPlayer1(player1);
		t.setPlayer2(player2);
		assertEquals("Check result", "Player2", t.check());
	}

}
