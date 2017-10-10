
public class Die {
	
	double numDots;
	
	public void roll() {
		numDots = (Math.random() * 6 + 1);
	}
	
	public int getNumDots() {
		return (int) numDots;
	}
}