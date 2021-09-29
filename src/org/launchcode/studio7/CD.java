package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String title, String author, Double storageCapacity, String discType) {
        super(title, author, storageCapacity, discType);
    }

    public CD(String title, String author, String discType) {
        this(title, author, 700.0, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The cd is spinning...");
    }

    @Override
    public void pause() {
        System.out.println("The cd is paused...");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
