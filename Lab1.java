public class Lab1 {
    public static void main(String[] args) {
        Automobile a = new Automobile("Porsche", "911 GT3 RS", 2026, 4);
        a.printInfo();

		// demonstrating polymorphism here...
        a = new SUV("Subaru", "Forester", 2026, 4, 5, 25.5);
        a.printInfo();
    }
}
