class InternetPlan {
    String planName;
    int speed;
    double price;

    InternetPlan() {
        this("Basic", 50, 499);
    }

    InternetPlan(String planName) {
        this(planName, 100, 699);
    }

    InternetPlan(String planName, int speed, double price) {
        this.planName = planName;
        this.speed = speed;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");
        InternetPlan p3 = new InternetPlan("Ultra", 200, 999);

        System.out.println("Plan 1:");
        p1.display();

        System.out.println("\nPlan 2:");
        p2.display();

        System.out.println("\nPlan 3:");
        p3.display();
    }
}
