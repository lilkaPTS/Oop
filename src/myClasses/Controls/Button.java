package myClasses.Controls;

import myInterfaces.ButtonClickable;

public class Button {
    private ButtonClickable handler;
    public Button(ButtonClickable handler){
        this.handler = handler;
    }
    public void click(){
        handler.execute();
    }
}
