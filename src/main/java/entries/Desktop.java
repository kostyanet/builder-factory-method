package entries;

public class Desktop extends Device {

    public void turnOn() {
        System.out.println("Desktop " + model + " is on.");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", category=" + category +
                ", dimension=" + dimension +
                '}';
    }
}
