package creationalpatterns.factorymethod.button;

/**
 * In this example, Buttons play a Product role and dialogs acts as Creators
 *
 * Different types of dialogs require their own types of elements. That's why we
 * create a subclass for each dialog type and override their factory methods
 *
 * Now, each dialog type will instantiate proper button classes. Base dialog works
 * with Products using their common interface, that's why its code remains
 * functional after all changes
 */

public interface Button {
    void render();
    void onClick();
}
