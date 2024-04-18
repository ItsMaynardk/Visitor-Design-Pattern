interface TelcoVisitor {
    void visit(Smart smart);
    void visit(Globe globe);
    void visit(Ditto ditto);
}