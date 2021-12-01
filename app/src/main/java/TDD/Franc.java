package TDD;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		super(amount);
		this.currency = currency;
	}
	
	Franc times(int multiplier) {
		return Money.franc(amount * multiplier);
	}

}