class GlobeSubscription implements TelcoSubscription {
    private final int dataAllowance;
    private final int price;

    public GlobeSubscription() {
        this.dataAllowance = 10;
        this.price = 450;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPrice() {
        return price;
    }

    public String getTelcoName() {
        return "Globe";
    }

    public boolean hasUnliCallText() {
        return true;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}