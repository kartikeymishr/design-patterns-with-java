package creationalpatterns.prototype.cache;

import creationalpatterns.prototype.Shape;

public class Demo {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        Shape shape1 = cache.get("Big Green Circle");
        Shape shape2 = cache.get("Medium Blue Rectangle");
        Shape shape3 = cache.get("Medium Blue Rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big Green Circle != Medium Blue Rectangle (yay!)");
        } else {
            System.out.println("Big Green Circle == Medium Blue Rectangle (boo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium Blue Rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (boo!)");
            }
        } else {
            System.out.println("Medium Blue Rectangles are the same (boo!)");
        }
    }
}
