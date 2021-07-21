package myClasses.Handlers;

import myInterfaces.ButtonClickable;

public class ButtonPrintHandler implements ButtonClickable {
    @Override
    public void execute() {
        System.out.println("Printing in progress ...");
    }
}
