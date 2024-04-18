class GlobeSubscription implements TelcoSubscription {
    private int dataAllowance;
    private int price;

    public GlobeSubscription(int dataAllowance, int price) {
        this.dataAllowance = dataAllowance;
        this.price = price;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPrice() {
        return price;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}