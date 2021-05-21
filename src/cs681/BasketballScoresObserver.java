package cs681;

public class BasketballScoresObserver implements Observer
{
	public BasketballScoresObserver() {};

	public void update(Observable o, Object arg) {
		if (arg instanceof HockeyScoreEvent) {
			HockeyScoreEvent hockeyEvent = (HockeyScoreEvent) arg;
			System.out.println("Team: " + hockeyEvent.getTeam());
			System.out.println("Score: " + hockeyEvent.getScore());

		} else if (arg instanceof BasketballScoreEvent) {
			BasketballScoreEvent basketballEvent = (BasketballScoreEvent) arg;
			System.out.println("Team: " + basketballEvent.getTeam());
			System.out.println("Score: " + basketballEvent.getScore());
		}
	}
}
















