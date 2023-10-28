package org.example.methodoverriding1;

/**
 * Class to demonstrate access - modifiers visibility when classes are in different packages.
 * Class to demonstrate inheritance.
 * Class to demonstrate Overriding.
 */
public class MethodOverridingSuperClassDemo {

    private String name;
    boolean isPublicOrPrivate;
    protected String domain;
    public String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublicOrPrivate() {
        return isPublicOrPrivate;
    }

    public void setPublicOrPrivate(boolean publicOrPrivate) {
        isPublicOrPrivate = publicOrPrivate;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void fun() {
        System.out.println("Fun function in Corporate");
    }
}
