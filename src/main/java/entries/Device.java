package entries;

import lombok.Data;

@Data
public abstract class Device implements Cloneable {
    protected String name;
    protected int model;
    protected int category;
    protected Dimension dimension;

    public abstract void turnOn();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Device copy = (Device) super.clone();
        copy.setDimension(new Dimension(copy.getDimension()));
        return copy;
    }
}
