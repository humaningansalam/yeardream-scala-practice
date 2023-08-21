package org.yeardream.java.oop.first;

public class Anonymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        //accessModifierTest.messageInside(); //compile error
        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.call();
    }

}
