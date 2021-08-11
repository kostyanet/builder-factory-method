package builder;

import entries.Mobile;
import lombok.Getter;

@Getter
public class MobileBuilder extends DeviceBuilder {

    private MobileBuilder() {
        super();
    }

    public static class Builder extends DeviceBuilder.Builder<Mobile> {
        @Override
        void init() {
            device = new Mobile();
        }
    }
}
