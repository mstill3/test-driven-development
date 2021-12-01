package TDD;

public abstract class Money {

	protected int amount = 10;
	protected String currency;

	Money(int amount) {
		this.amount = amount;
	}

	static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}

	abstract Money times(int multiplier);

	public String currency() {
		return currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

}