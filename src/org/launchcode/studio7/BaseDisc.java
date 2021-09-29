package org.launchcode.studio7;

public abstract class BaseDisc {

    private String title;
    private String author;
    private Double storageCapacity;
    private String discType;

    public BaseDisc (String title, String author, Double storageCapacity, String discType) {
        this.title = title;
        this.author = author;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
    }

    public void readData() {
        System.out.println("Currently reading " + this.title + "disc...");
    }

    public void storeData() {
        System.out.println("Currently storing something random to disc" + this.discType);
    }

    public boolean writeData(double dataSize) {
        if(dataSize > storageCapacity) {
            return false;
        }
        return true;
    }

    public void reportInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Storage Capacity: " + this.storageCapacity);
        System.out.println("Disc Type: " + this.discType);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

}
