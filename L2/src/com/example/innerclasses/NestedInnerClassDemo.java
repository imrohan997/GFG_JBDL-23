package com.example.innerclasses;

/**
 * This class demonstrates Nested Inner class Demo
 * Below class(NestedInnerClassDemo) is the outer class.
 * Key pointers-
 * 1.Nester inner class have all access modifiers i.e private, default, protected, public.
 * 2.Nested inner class in a member of outer class.
 * 3.Nested inner class have access to member variable of outer class irrespective of access modifiers.
 * 4.Static methods cannot be created inside inner class since innter class belong to object of outer class and
 * static belong to class and not any object.
 */
public class NestedInnerClassDemo {

    private int x = 1;
    class InnerClass {

        public void show() {
            System.out.println("Inside InnerClass show method : " + x);
        }
    }

    public static void main(String[] args) {
        NestedInnerClassDemo.InnerClass innerClass =  new NestedInnerClassDemo().new InnerClass();
        innerClass.show();
    }

}
