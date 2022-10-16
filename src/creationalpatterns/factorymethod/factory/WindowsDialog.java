package creationalpatterns.factorymethod.factory;

import creationalpatterns.factorymethod.button.Button;
import creationalpatterns.factorymethod.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
