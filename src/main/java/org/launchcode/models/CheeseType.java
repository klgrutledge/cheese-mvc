package org.launchcode.models;

/**
 * Created by Krysta on 6/8/17.
 */
public enum CheeseType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake"),
    NASTY ("Nasty");

    private final String name;

    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
