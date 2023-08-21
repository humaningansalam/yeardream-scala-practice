package org.yeardream.java.oop.second;

import org.yeardream.java.oop.first.AccessModifierTest;

public class Child extends AccessModifierTest {
    public void call() {
     // this.messageInside();
     // this.messageDefault();
        this.messageProtected();
        this.messageOutside();
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
