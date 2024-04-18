interface TelcoSubscription {
    void accept(TelcoVisitor visitor);
    int getDataAllowance();
    int getPrice();
}