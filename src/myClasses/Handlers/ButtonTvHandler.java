package myClasses.Handlers;

import myInterfaces.ButtonClickable;

public class ButtonTvHandler implements ButtonClickable {

    private static boolean tvState = false;
    @Override
    public void execute() {
        if(!tvState){
            System.out.println("Tv on");
            tvState = true;
        }else {
            System.out.println("Tv off");
            tvState = false;
        }
    }
}
