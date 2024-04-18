class UsagePromoVisitor implements TelcoVisitor {
    private int dataAllowance;
    private int price;

    public int getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void visit(SmartSubscription subscription) {
        setDataAllowance(subscription.getDataAllowance());
        setPrice(subscription.getPrice());
        System.out.println(subscription.getTelcoName() + " Data Usage Offer and price: " + getDataAllowance() + "GB for ₱" + getPrice() + " per month.");
    }

    @Override
    public void visit(GlobeSubscription subscription) {
        setDataAllowance(subscription.getDataAllowance());
        setPrice(subscription.getPrice());
        System.out.println(subscription.getTelcoName() + " Data Usage Offer and price: " + getDataAllowance() + "GB for ₱" + getPrice() + " per month.");
    }

    @Override
    public void visit(DittoSubscription subscription) {
        setDataAllowance(subscription.getDataAllowance());
        setPrice(subscription.getPrice());
        System.out.println(subscription.getTelcoName() + " Data Usage Offer and price: " + getDataAllowance() + "GB for ₱" + getPrice() + " per month.");
    }
}