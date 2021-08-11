package entries;

public class Mobile extends Device {

    public void turnOn() {
        System.out.println("Mobile " + model + " is on.");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", category=" + category +
                ", dimension=" + dimension +
                '}';
    }
}
