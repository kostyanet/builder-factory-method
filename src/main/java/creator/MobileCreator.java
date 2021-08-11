package creator;

import builder.MobileBuilder;
import entries.Dimension;
import entries.Mobile;
import lombok.NonNull;

public class MobileCreator implements DeviceCreator {
    public Mobile createDevice(String name, int model, int category, @NonNull int width, @NonNull int height, @NonNull int depth) {
        Dimension dimension = new Dimension(width, height, depth);

        return new MobileBuilder.Builder()
                .withName(name)
                .withModel(model)
                .withCategory(category)
                .withDimension(dimension)
                .build();
    }
}
