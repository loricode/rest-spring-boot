package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idproveedor;
	
	@Column(name = "nombre")
	private String nombre;	
	
	@Column(name = "apellido")
	private String apellido;	
	
	public Proveedor() { }
	
	public Proveedor(long idproveedor ,String nombre, String apellido) {
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public long getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(long idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
