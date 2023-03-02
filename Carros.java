package com;

public class Carros {
	private int id;
	private String nombre;
	private String modelo;
	private double precio;

	
	
	public Carros() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String marca) {
		this.modelo = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
public static void main(String[]args){
	System.out.println(x: "Hola crystal");

	Carros carros = new Carros();
	carros.setNombre(nombre:"Jeep");
	carros.setModelo(modelo:"2004");

	Carros segundoCarro = new Carros();
	segundoCarro.setNombre(nombre:"Ram Dodge")
	segundoCarro.setModelo("2003")


	carros.imprimirCarro();

}
