package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD aDVD = new DVD("Blade Runner", "Harrison Ford", "video");
        CD aCD = new CD("Spice Girls", "Spice Girls", "audio");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        aDVD.pause();
        aDVD.spinDisc();
        aDVD.readData();
        aDVD.storeData();
        aDVD.writeData(45.0);
        aDVD.reportInformation();

        aCD.pause();
        aCD.spinDisc();
        aCD.readData();
        aCD.storeData();
        aCD.writeData(9000.0);
        aCD.reportInformation();

    }
}
