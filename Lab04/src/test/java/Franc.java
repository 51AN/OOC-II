public class Franc {
    private int amount;
    public Franc(int amount){
        this.amount = amount;
    }
    public Franc times(int multiplier){
        amount *= multiplier;
        return new Franc(amount);
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public boolean equals(Object o){
        Franc franc = (Franc) o;
        return amount == franc.getAmount();
    }
}
