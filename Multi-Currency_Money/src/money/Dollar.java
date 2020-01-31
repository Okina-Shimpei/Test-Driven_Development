package money;

public class Dollar extends Money {
	public Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}
	@Override
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
