package com.sofka;

public abstract class Carro {
    protected double peso;
    protected double altura;
    protected double ancho;
    protected double largo;
    protected int numeroPuertas;
    protected boolean encendido;
    protected String modelo;

    public Carro(){

    }

    public Carro(double peso, double altura, double ancho, double largo, int numeroPuertas, boolean encendido, String modelo) {
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroPuertas = numeroPuertas;
        this.encendido = encendido;
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //Implementando polimorfismo
    public abstract void informacion();


}
