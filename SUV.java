public class SUV extends Automobile {
    private int numPass;
    private double cargoSpc;

    // make it private so people won't manipulate your variables 
    public SUV(String mk, String md, int y, int nw, int np, double c) {
        super(mk, md, y, nw);
        numPass = np;
        cargoSpc = c;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Passengers: " + numPass);
        System.out.println("Cargo Space: " + cargoSpc);
    }
}
