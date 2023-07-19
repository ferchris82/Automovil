package com.logica;

//Una clase siempre debe tener atributos, constructores y metodos.

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Mapeo para que JAVA sepa y poner una clase de entidad (se convierta en tabla)
public class Automovil implements Serializable {
    // marcar cual va a ser los atributos que se generen automaticamente
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    private int cantPuertas;

    //El constructor vacio nos permite crear un automovil con atributos pero sin valores asignados
    public Automovil() {
    }

    //El constructor con parametros nos permite asignarle valores determinados
    public Automovil(int id, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }
    //Los metodos nos sirven para obtener y establecer valores de los atributos de la clase
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    
    
    
}
