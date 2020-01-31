package money;

public abstract class Money {
	protected int amount;
	protected String currency;
	abstract Money times(int multiplier);
	String currency() {
		return currency;
	}
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	static Money franc(int amount) {
		return new Franc(amount);
	}
}
