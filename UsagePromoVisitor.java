class UsagePromoVisitor implements TelcoVisitor {
    @Override
    public void visit(SmartSubscription subscription) {
        System.out.println("Data Usage Offer and price: " + subscription.getDataAllowance() + "GB for ₱" + subscription.getPrice() + " per month.");
    }

    @Override
    public void visit(GlobeSubscription subscription) {
        System.out.println("Data Usage Offer and price: " + subscription.getDataAllowance() + "GB for ₱" + subscription.getPrice() + " per month.");
    }

    @Override
    public void visit(DittoSubscription subscription) {
        System.out.println("Data Usage Offer and price: " + subscription.getDataAllowance() + "GB for ₱" + subscription.getPrice() + " per month.");
    }
}