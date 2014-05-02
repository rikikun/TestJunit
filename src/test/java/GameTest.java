public class GameTest {

	public String powYingChub(String player1, String player2) {
		if (player1 == player2) {
			return "Draw";
		}
		if ((player1 == "H" && player2 == "P")
				|| (player1 == "P" && player2 == "S")
				|| (player1 == "S" && player2 == "H")) {
			return "Player2";
		}
		return "Player1";
	}

}
