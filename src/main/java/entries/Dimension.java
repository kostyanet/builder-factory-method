package entries;

import lombok.NonNull;
import lombok.Value;

@Value
public class Dimension {
    int width;
    int height;
    int depth;

    public Dimension(@NonNull int width, @NonNull int height, @NonNull int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        validate(width, height, depth);
    }

    public Dimension(@NonNull Dimension dimension) {
        this.width = dimension.getWidth();
        this.height = dimension.getHeight();
        this.depth = dimension.getDepth();
        validate(width, height, depth);
    }

    private static void validate(int width, int height, int depth) throws IllegalArgumentException {
        if (width <= 0 || height <= 0 || depth <= 0)
            throw new IllegalArgumentException("Each dimension must be > 0");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimension dimension = (Dimension) o;
        return width == dimension.width &&
                height == dimension.height &&
                depth == dimension.depth;
    }

    @Override
    public int hashCode() {
        return 31 * width + 31 * height + 31 * depth;
    }
}
