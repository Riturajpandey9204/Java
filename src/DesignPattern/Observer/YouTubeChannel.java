package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<java.util.Observer> subscribers = new ArrayList<>();


    @Override
    public void register(java.util.Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void deRegister(java.util.Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges() {

    }
}
