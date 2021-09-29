package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String title, String author, Double storageCapacity, String discType) {
        super(title, author, storageCapacity, discType);
    }

    public DVD(String title, String author, String discType) {
        this(title, author, 4700.0, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The dvd is spinning...");
    }

    @Override
    public void pause() {
        System.out.println("The dvd is paused...");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
