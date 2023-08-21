package org.yeardream.java.oop.second;

import org.yeardream.java.oop.first.AccessModifierTest;

public class Anonymous {
    public void call() {

        AccessModifierTest accessModifierTest = new AccessModifierTest();
//      accessModifierTest.messageInside(); compile error
//      accessModifierTest.messageDefault();
//      accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }


}