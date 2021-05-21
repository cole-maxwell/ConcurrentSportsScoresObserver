package cs681;

public class StartupSportsScoresMonitor
{
	public static void main(String[] args)
	{
		BasketballScoreObservable basketballScoreObservable = new BasketballScoreObservable();
		HockeyScoreObservable hockeyScoreObservable = new HockeyScoreObservable();

		BasketballScoresObserver basketballScoresObserver = new BasketballScoresObserver();
		HockeyScoresObserver hockeyScoresObserver = new HockeyScoresObserver();

		BasketballScoreEvent basketballEventA = new BasketballScoreEvent("Boston Celtics", 106);
		BasketballScoreEvent basketballEventB = new BasketballScoreEvent("Brooklyn Nets", 102);
		HockeyScoreEvent hockeyEventA = new HockeyScoreEvent("Boston Bruins", 3);
		HockeyScoreEvent hockeyEventB = new HockeyScoreEvent("Washington Capitals", 1);

		System.out.println("\n...updating score for the basketball game...\n");
		basketballScoresObserver.update(basketballScoreObservable, basketballEventA);
		basketballScoresObserver.update(basketballScoreObservable, basketballEventB);
		System.out.println("\n...updating score for the hockey game...\n");
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventA);
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventB);

		BasketballScoreEvent basketballEventC = new BasketballScoreEvent("Boston Celtics", 109);
		BasketballScoreEvent basketballEventD = new BasketballScoreEvent("Brooklyn Nets", 104);
		HockeyScoreEvent hockeyEventC = new HockeyScoreEvent("Boston Bruins", 4);
		HockeyScoreEvent hockeyEventD = new HockeyScoreEvent("Washington Capitals", 2);

		System.out.println("\n...updating score for the basketball game...\n");
		basketballScoresObserver.update(basketballScoreObservable, basketballEventC);
		basketballScoresObserver.update(basketballScoreObservable, basketballEventD);
		System.out.println("\n...updating score for the hockey game...\n");
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventC);
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventD);

		BasketballScoreEvent basketballEventE = new BasketballScoreEvent("Boston Celtics", 112);
		BasketballScoreEvent basketballEventF = new BasketballScoreEvent("Brooklyn Nets", 107);
		HockeyScoreEvent hockeyEventE = new HockeyScoreEvent("Boston Bruins", 4);
		HockeyScoreEvent hockeyEventF = new HockeyScoreEvent("Washington Capitals", 3);

		System.out.println("\n...updating score for the basketball game...\n");
		basketballScoresObserver.update(basketballScoreObservable, basketballEventE);
		basketballScoresObserver.update(basketballScoreObservable, basketballEventF);
		System.out.println("\n...updating score for the hockey game...\n");
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventE);
		hockeyScoresObserver.update(hockeyScoreObservable, hockeyEventF);
	}
}





























