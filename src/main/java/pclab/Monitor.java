package pclab;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public Monitor(String model, String manufacturer, Resolution resolution){
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color: " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model=" + model +
                ", manufacturer='" + manufacturer + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
