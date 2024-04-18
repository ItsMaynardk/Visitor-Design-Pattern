interface TelcoSubscription {
    void accept(TelcoVisitor visitor);
    String getTelcoName();
    int getDataAllowance();
    int getPromoPrice();
    boolean getUnliCallText();
}