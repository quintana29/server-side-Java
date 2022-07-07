package com.sofka;

public class CarroBMW extends Carro  {


    public CarroBMW() {
    }

    public void turbo(){
        System.out.println("Turbo encendido");
    }
    @Override
    public void informacion(){
        System.out.println("BMW año 2018");
    }
}
