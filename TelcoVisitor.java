interface TelcoVisitor {
    void visit(SmartSubscription subscription);
    void visit(GlobeSubscription subscription);
    void visit(DittoSubscription subscription);
}