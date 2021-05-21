package cs681;

public class HockeyScoreEvent
{
	private String team;
	private int score;

	public HockeyScoreEvent(String team, Integer score) {
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




