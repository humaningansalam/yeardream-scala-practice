package org.yeardream.java.oop.first;

public class AccessModifierTest {

    private void messageInside() {
        System.out.println("This is private modifier");
    }
    void messageDefault() {
        messageInside();
        System.out.println("This is default(package-private) modifier");
    }
    protected void messageProtected() {
        messageInside();
        System.out.println("This is protected modifier");
    }
    public void messageOutside() {
        messageInside();
        System.out.println("This is public modifier");
    }
}

