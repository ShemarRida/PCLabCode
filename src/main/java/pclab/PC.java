package pclab;

public class PC {
    private Case aCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard){
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private Case getaCase(){
        return aCase;
    }
    private Motherboard getMotherboard(){
        return motherboard;
    }
    private Monitor getMonitor(){
        return monitor;
    }
    private void drawLogo(){
        monitor.drawPixelAt(5, 5, "red");
    }
    public void description(){

        System.out.println("Welcome to the worst buy below is the description of the pc on sale today\n");
    }
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows XP");
    }

    @Override
    public String toString() {
        return aCase +
                " " + monitor +
                " " + motherboard ;
    }
}
