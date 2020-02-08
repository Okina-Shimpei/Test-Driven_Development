package money;

interface Expression {
	Expression plus(Expression tenFrancs);
	Money reduce(Bank bank, String to);
}
