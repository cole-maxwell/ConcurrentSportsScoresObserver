package cs681;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Observable 
{

    private ConcurrentLinkedQueue<Observer> observers = new ConcurrentLinkedQueue<Observer>();
    private AtomicBoolean changed = new AtomicBoolean(false);

    public Observable() {};

    public Observer getObserver(){
        return this.observers.peek();
    }

    public void addObserver(Observer o) {
        if (observers.contains(o))
            System.out.println("Observer already added");
        else {
            observers.add(o);
        }
    };

    public void deleteObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
        else
            System.out.println("Observer doesn't exist, so it cannot be removed.");
        
    };

    protected void setChanged() {
        this.changed.set(true);
    };

    protected void clearChanged() {
        this.changed.set(false);
    };

    public boolean hasChanged() {
        return this.changed.get();
    };

    public void notifyObservers(Object obj) {
            
        if( hasChanged() ){
            for (Observer o : observers) {
                System.out.println("Updated with: " + o);
            }
            this.clearChanged();
        }
    }
}

