package money;

public abstract class Money {
	protected int amount;
	abstract Money times(int multiplier);
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
}
