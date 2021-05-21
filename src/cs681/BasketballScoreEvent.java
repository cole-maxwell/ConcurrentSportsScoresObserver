package cs681;

public class BasketballScoreEvent
{
	private String team;
	private int score;

	public BasketballScoreEvent(String team, Integer score) {
		this.team = team;
		this.score = score;
	}
	public String getTeam() {
		return team;
	}
	public Integer getScore() {
		return score;
	}
}



