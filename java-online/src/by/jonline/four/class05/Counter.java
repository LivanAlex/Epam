package by.jonline.four.class05;

public class Counter {
	private long counter;
	
	/** Sets default value of counter = 0 */
	public Counter() {
		counter = 0;
	}

	/** Sets value of counter */
	public Counter(long counter) {
		this.counter = counter;
	}

	public long getCounter() {
		return counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}
	
	/** Increases value of counter */
	public void increase() {
		counter++;
	}

	/** Decreases value of counter */
	public void decrease() {
		counter--;
	}
}
