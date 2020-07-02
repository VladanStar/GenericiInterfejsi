package com.company;

public class GenericInterfejso <T extends D>{
    private T objReff;

    public GenericInterfejso() {
    }

    public GenericInterfejso(T objReff) {
        this.objReff = objReff;
    }
    public void doRunTest(){
        this.objReff.printClass();
    }
}
