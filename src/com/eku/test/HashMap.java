package com.eku.test;

import java.util.HashSet;
import java.util.Set;

public class HashMap {

    public static void main(String[] args) {

        A a1 = new A();
        a1.id = 1;
        a1.name = "jack";
        A a2 = new A();
        a2.id = 2;
        a2.name = "john";
        A a3 = new A();
        a3.id = 2;
        a3.name = "holm";
        A a4 = new A();
        a4.id = 2;
        a4.name = "hold";
        A a5 = new A();
        a5.id = 2;
        a5.name = "hold1";


        Set<A> set = new HashSet<>();
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);


        for (A a : set) {
            System.out.println(a);
        }


        System.out.println(set.contains(a5));
    }
}

class A {
    int id;
    String name;

    @Override
    public int hashCode() {
        System.out.println("Object id=" + this.id +  " - Hash code exicuted");
        return id;
    }

    @Override
    public boolean equals(Object that){
        System.out.println("Object id=" + this.id +  " - Equals exicuted");
        A thatA = (A) that;
        return this.id == thatA.id && this.name.equals(thatA.name);
    }

    @Override
    public String toString(){
        System.out.println("id=" + this.id + "; name=" + this.name);
        return "";
    }
}
