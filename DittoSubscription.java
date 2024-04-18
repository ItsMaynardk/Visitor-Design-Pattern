class DittoSubscription implements TelcoSubscription {
    private final int dataAllowance;
    private final int price;

    public DittoSubscription() {
        this.dataAllowance = 8;
        this.price = 400;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPrice() {
        return price;
    }

    public String getTelcoName() {
        return "Ditto";
    }

    public boolean hasUnliCallText() {
        return true;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}