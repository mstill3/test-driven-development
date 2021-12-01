package TDD;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount);
		this.currency = currency;
	}

	Dollar times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

}