package creationalpatterns.factorymethod.factory;

import creationalpatterns.factorymethod.button.Button;
import creationalpatterns.factorymethod.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
