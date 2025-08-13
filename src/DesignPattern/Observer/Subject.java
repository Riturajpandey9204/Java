package DesignPattern.Observer;

import java.util.Observer;

public interface Subject {

    //register, deregister and notify
    void register(Observer ob);

    void deRegister(Observer ob);

    void notifyChanges();
}
