/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstrac;

/**
 *
 * @author J2EE-33
 */
public class ACMEbicycle implements Bicycle{
    int cadence=0;
    int speed=0;
    int gear=1;

    @Override
    public void changeCadence(int newValue) {
         cadence= newValue; }

    @Override
    public void changeGear(int newValue) {
       gear=newValue;}

    @Override
    public void speedUp(int increment) {
       speed+= increment; //speed=speed+decrement;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed-=decrement;//speed=speed-decrement;
       }
    void printStates(){
        System.out.println("cadence:"+cadence+"speed:"+speed+"gear:"+gear);
    
    }
    
}
