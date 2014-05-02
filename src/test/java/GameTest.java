public class GameTest {
	private  PlayerPowYingChub player1=new PlayerPowYingChub();
	private  PlayerPowYingChub player2=new PlayerPowYingChub();

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

//	public void main(String[] args) {
//		int time = 10;
//
//		GameTest system = new GameTest();
//		String p1, p2;
//		for (int i = 0; i < time; i++) {
//			p1 = player1.genOutput();
//			p2 = player2.genOutput();
//			System.out.println("Time :" + i + " Player1:" + p1 + " Player2:" + p2
//					+ "	Result:" + system.powYingChub(p1, p2));
//		}
//	}
	public void setPlayer1(PlayerPowYingChub player1){
		this.player1=player1;
	}
	public void setPlayer2(PlayerPowYingChub player2){
		this.player2=player2;
	}
	
	public String check(){
		return powYingChub(this.player1.genOutput(),this.player2.genOutput());
	}

}
