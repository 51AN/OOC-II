public class Dollar {
    private int amount;
    public Dollar(int amount){
        this.amount = amount;
    }
    public Dollar times(int multiplier){
        amount *= multiplier;
        return new Dollar(amount);
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public boolean equals(Object o){
        Dollar dollar = (Dollar) o;
        return amount == dollar.getAmount();
    }
}
