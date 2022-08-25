public class Money {
    private int amount;
    public Money(int amount){
        this.amount = amount;
    }
    public Money times(int multiplier){
        amount *= multiplier;
        return new Money(amount);
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public boolean equals(Object o){
        Money money = (Money) o;
        return amount == money.getAmount();
    }
}
