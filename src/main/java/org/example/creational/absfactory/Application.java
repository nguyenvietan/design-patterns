package main.java.org.example.creational.absfactory;

public class Application {
    private final IButton button;
    private final ICheckbox checkBox;

    public Application(IGUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
