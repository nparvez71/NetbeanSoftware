
package com.abstrac;


public class NewApp {
    public static void main(String[] args) {
        ACMEbicycle abc=new ACMEbicycle();
        abc.changeCadence(50);
        abc.changeGear(3);
        abc.speedUp(150);
        abc.applyBrakes(10);
        abc.printStates();
        
        abc.changeCadence(150);
        abc.changeGear(6);
        abc.speedUp(250);
        abc.applyBrakes(20);
        abc.printStates();
        
    }
}
