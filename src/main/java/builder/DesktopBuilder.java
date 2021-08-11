package builder;

import entries.Desktop;
import lombok.Getter;

@Getter
public class DesktopBuilder extends DeviceBuilder {

    private DesktopBuilder() {
        super();
    }

    public static class Builder extends DeviceBuilder.Builder<Desktop> {
        @Override
        void init() {
            device = new Desktop();
        }
    }
}
