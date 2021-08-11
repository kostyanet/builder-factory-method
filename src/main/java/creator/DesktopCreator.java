package creator;

import builder.DesktopBuilder;
import entries.Desktop;
import entries.Dimension;
import lombok.NonNull;

public class DesktopCreator implements DeviceCreator {
    public Desktop createDevice(String name, int model, int category, @NonNull int width, @NonNull int height, @NonNull int depth) {
        Dimension dimension = new Dimension(width, height, depth);

        return new DesktopBuilder.Builder()
                .withName(name)
                .withModel(model)
                .withCategory(category)
                .withDimension(dimension)
                .build();
    }
}
