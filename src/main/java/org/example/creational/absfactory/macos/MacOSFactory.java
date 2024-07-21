package main.java.org.example.creational.absfactory.macos;

import main.java.org.example.creational.absfactory.IButton;
import main.java.org.example.creational.absfactory.ICheckbox;
import main.java.org.example.creational.absfactory.IGUIFactory;

public class MacOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
