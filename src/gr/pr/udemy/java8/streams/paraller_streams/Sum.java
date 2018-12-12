package gr.pr.udemy.java8.streams.paraller_streams;

public class Sum {

	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void performSum(int i) {
		this.total += i;
	}
}
