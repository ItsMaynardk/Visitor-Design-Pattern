class UnliCallOffer implements TelcoVisitor {
    @Override
    public void visit(Smart smart) {
        System.out.println("Smart unlimited calls and text package: Not Available");
    }

    @Override
    public void visit(Globe globe) {
        System.out.println("Globe unlimited calls and text package: Unlimited calls and texts within Globe network.");
    }

    @Override
    public void visit(Ditto ditto) {
        System.out.println("Ditto unlimited calls and text package: Unlimited calls and texts to all networks within the country.");
    }
}