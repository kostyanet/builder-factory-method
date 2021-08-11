package creator;

import entries.Device;
import lombok.NonNull;

public interface DeviceCreator {
    public Device createDevice(String name, int model, int category, @NonNull int width, @NonNull int height, @NonNull int depth);
}
