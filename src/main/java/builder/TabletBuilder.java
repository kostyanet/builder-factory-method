package builder;

import entries.Tablet;

public class TabletBuilder extends DeviceBuilder {

    private TabletBuilder() {
        super();
    }

    public static class Builder extends DeviceBuilder.Builder<Tablet> {
        @Override
        void init() {
            device = new Tablet();
        }
    }
}
