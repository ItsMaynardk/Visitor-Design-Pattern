public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new SmartSubscription(15, 500);
        TelcoSubscription globe = new GlobeSubscription(10, 450);
        TelcoSubscription ditto = new DittoSubscription(8, 400);

        UsagePromoVisitor usagePromoVisitor = new UsagePromoVisitor();

        System.out.println("Smart:");
        smart.accept(usagePromoVisitor);

        System.out.println("Globe:");
        globe.accept(usagePromoVisitor);

        System.out.println("Ditto:");
        ditto.accept(usagePromoVisitor);
    }
}