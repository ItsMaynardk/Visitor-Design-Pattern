class UsagePromo implements TelcoVisitor {
    @Override
    public void visit(Smart smart) {
        System.out.println("Smart Data Usage Offer and price: " + smart.getDataAllowance() + " GB for ₱" + smart.getPromoPrice());
    }

    @Override
    public void visit(Globe globe) {
        System.out.println("Globe Data Usage Offer and price: " + globe.getDataAllowance() + " GB for ₱" + globe.getPromoPrice());
    }

    @Override
    public void visit(Ditto ditto) {
        System.out.println("Ditto Data Usage Offer and price: " + ditto.getDataAllowance() + " GB for ₱" + ditto.getPromoPrice());
    }
}