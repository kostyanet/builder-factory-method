package builder;

import entries.Device;
import entries.Dimension;
import lombok.Getter;

@Getter
public abstract class DeviceBuilder {
    protected String name;
    protected int model;
    protected int category;
    protected Dimension dimension;

    protected DeviceBuilder() {}

    public abstract static class Builder<T extends Device> {
        protected T device = null;

        public Builder() {
            init();
        }

        abstract void init();

        public DeviceBuilder.Builder<T> withName(String name) {
            device.setName(name);
            return this;
        }

        public DeviceBuilder.Builder<T> withCategory(int category) {
            device.setCategory(category);
            return this;
        }

        public DeviceBuilder.Builder<T> withModel(int model) {
            device.setModel(model);
            return this;
        }

        public DeviceBuilder.Builder<T> withDimension(Dimension dimension) {
            device.setDimension(dimension);
            return this;
        }

        public T build() {
            return device;
        }
    }
}
