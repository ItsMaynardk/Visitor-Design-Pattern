class SmartSubscription implements TelcoSubscription {
    private final int dataAllowance;
    private final int price;

    public SmartSubscription() {
        this.dataAllowance = 15;
        this.price = 500;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPrice() {
        return price;
    }

    public String getTelcoName() {
        return "Smart";
    }

    public boolean hasUnliCallText() {
        return false;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}