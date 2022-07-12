package com.virtuallife;

public class Main {
    public static void main(String[] args) {

    Persona unaPersona = new Persona();

        unaPersona.setEdad(44);
        unaPersona.setNombre("Gloria");
        unaPersona.setTelefono("636963256");

        System.out.println("Nombre: " + unaPersona.getNombre()+ "\n" + "Edad: " + unaPersona.getEdad() + "\n" + "Teléfono: " + unaPersona.getTelefono());

        unaPersona.setEdad(34);
        unaPersona.setNombre("Manuel");
        unaPersona.setTelefono("654222333");

        System.out.println("Nombre: " + unaPersona.getNombre()+ "\n" + "Edad: " + unaPersona.getEdad() + "\n" + "Teléfono: " + unaPersona.getTelefono());

    }
}