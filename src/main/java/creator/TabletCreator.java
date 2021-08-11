package creator;

import builder.TabletBuilder;
import entries.Dimension;
import entries.Tablet;
import lombok.NonNull;

public class TabletCreator implements DeviceCreator {
    public Tablet createDevice(String name, int model, int category, @NonNull int width, @NonNull int height, @NonNull int depth) {
        Dimension dimension = new Dimension(width, height, depth);

        return new TabletBuilder.Builder()
                .withName(name)
                .withModel(model)
                .withCategory(category)
                .withDimension(dimension)
                .build();
    }
}
