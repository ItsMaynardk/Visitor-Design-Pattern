public class TelcoPromo {
        public static void main(String[] args) {
            TelcoSubscription smart = new Smart(15, 500, false);
            TelcoSubscription globe = new Globe(10, 450, true);
            TelcoSubscription ditto = new Ditto(8, 400, true);
    
            UsagePromo usagePromo = new UsagePromo();
            UnliCallOffer unliCallOffer = new UnliCallOffer();
    
            System.out.println("Smart Data Usage Offer and price:");
            smart.accept(usagePromo);
    
            System.out.println("Globe Data Usage Offer and price:");
            globe.accept(usagePromo);
    
            System.out.println("Ditto Data Usage Offer and price:");
            ditto.accept(usagePromo);
    
            System.out.println("\nSmart unlimited calls and text package:");
            smart.accept(unliCallOffer);
    
            System.out.println("Globe unlimited calls and text package:");
            globe.accept(unliCallOffer);
    
            System.out.println("Ditto unlimited calls and text package:");
            ditto.accept(unliCallOffer);
        }
    }