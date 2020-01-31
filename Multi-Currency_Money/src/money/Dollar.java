package money;

public class Dollar extends Money {
	private String currency;
	public Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}
	@Override
	String currency() {
		return currency;
	}
	@Override
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
