package entries;

public class Tablet extends Device {
    public void turnOn() {
        System.out.println("Tablet " + model + " is on.");
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", category=" + category +
                ", dimension=" + dimension +
                '}';
    }
}
