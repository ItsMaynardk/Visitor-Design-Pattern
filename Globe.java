class Globe implements TelcoSubscription {
    private int dataAllowance;
    private int promoPrice;
    private boolean unliCallText;
    private final String telcoName = "Globe";

    public Globe(int dataAllowance, int promoPrice, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public int getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}