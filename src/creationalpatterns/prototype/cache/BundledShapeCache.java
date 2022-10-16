package creationalpatterns.prototype.cache;

import creationalpatterns.prototype.shapes.Circle;
import creationalpatterns.prototype.shapes.Rectangle;
import creationalpatterns.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * A centralized prototype registry (or factory), which would contain a set of pre-defined prototype objects.
 * This way we can retrieve new objects from the factory by passing its name or other parameters. The
 * factory will search for an appropriate prototype, clone it and return you a copy.
 */

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big Green Circle", circle);
        cache.put("Medium Blue Rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
