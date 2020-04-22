package pclab;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 55, 5);
        Case aCase = new Case("H420", "Sony", "240 volts", dimensions);
        Resolution resolution = new Resolution(10, 10);
        Monitor monitor = new Monitor("27 inch Beast", "HP", resolution);
        Motherboard motherboard = new Motherboard("BJ-300", "Pentium", 4, 5, "v.244");
        PC pc = new PC(aCase, monitor, motherboard);
        pc.description();
        System.out.println(pc);
        pc.powerUp();



    }
}
