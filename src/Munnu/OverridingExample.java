package Munnu;

import java.io.*;

class Animal {
    void eat() {
        System.out.println("Animal kuch bhi kha sakta hai.");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog meat machli hi khaega");
    }

    void eatAsAnimal() {
        super.eat();
    }
}
class OverridingExample {
    public static void main(String args[]) {
        Dog d1 = new Dog();
/*
        Animal a1 = new Animal();
*/
        d1.eat();
/*        a1.eat();
        Animal animal = new Dog();
        animal.eat();
        ((Dog) animal).eatAsAnimal();*/
    }
}
