package cs681;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;

public class BasketballScoreObservable extends Observable
{
	private TreeMap<String, Integer> scoresMap = new TreeMap<String, Integer>();
	private ReentrantLock lockTQ = new ReentrantLock();

	public BasketballScoreObservable() {};

	public void changeScore(String team, Integer score) {

		lockTQ.lock();
		scoresMap.put(team, score);
		setChanged();
		notifyObservers(new HockeyScoreEvent(team, score));
		lockTQ.unlock();
	}
}

