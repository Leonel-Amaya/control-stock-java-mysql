package com.alura.jdbc.modelo;

public class Producto {
	private Integer id, cantidad;
	private String nombre, descripcion;
	
	public Producto(String nombre, String descripcion, Integer cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setId(int id) {
		this.id = id;
		
	}
	
	@Override
	public String toString() {
		return String.format("{id:%s, nombre:%s, descripcio,%s,cantidad:%d}", this.id,this.nombre,this.descripcion,this.cantidad);
	}
}
