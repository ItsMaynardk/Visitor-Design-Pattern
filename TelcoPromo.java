public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new SmartSubscription();
        TelcoSubscription globe = new GlobeSubscription();
        TelcoSubscription ditto = new DittoSubscription();

        UsagePromoVisitor usagePromoVisitor = new UsagePromoVisitor();

        System.out.println("Smart:");
        smart.accept(usagePromoVisitor);

        System.out.println("Globe:");
        globe.accept(usagePromoVisitor);

        System.out.println("Ditto:");
        ditto.accept(usagePromoVisitor);
    }
}