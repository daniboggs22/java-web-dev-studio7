package org.launchcode.studio7;

public abstract class BaseDisc {
    String title;
    String artist;
    String genre;
    String diskType;
    double storageAmount;
    double storage;
    public void readData(){};
    public void writeData(){};
    public void storageIsFull(){};

}
