package com.company;

class Foo{
    int var0; // type of access : package access [every object belong to 'foo' will see this data member but only if they are in the same package]
    // which is in this program it is 'com.company'
    public int var1; // type of access : public [every object belong to 'foo' will see this data member]
    private int var2; // type of access : private [only this class will see this data member and use it]

    protected int var3; // this data member can be seen by
    /*
    1- the objects from the same class
    2- the objects from the son class or the subclass
    "The protected access modifier is accessible within package and outside the package but through inheritance only.
    The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class. It provides more accessibility than the default modifer."
    according to www.javatpoint.com
     */

    private void counter(){
        // this is an utility method
        var2++;
        // this method belong to the class foo no one can use it even the object of the class Foo
    }

    public String type(){
        counter();
        System.out.println("<class 'Foo'>");
        return "<class 'Foo'>";

        // this is a public method every object belong to the class Foo can see it and use it
    }

    protected int getVar0(){
        return var0;

        // every object belong to Foo and every and object from classes that inherits from Foo will see and use this method
    }



}

public class Main {

    public static void main(String[] args) {
        Foo obj0 = new Foo();
        obj0.type();
    }
}
