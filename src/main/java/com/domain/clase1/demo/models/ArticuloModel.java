package com.domain.clase1.demo.models;

import java.util.Date;

public class ArticuloModel {

	private int id;
	private String titulo;
	private String codigo;
	private Date fecha_creacion;
	private float precio;
	private int stock;
	private int marcas_id;
	private int categorias_id;

	public ArticuloModel(int id, String titulo, String codigo, Date fecha_creacion, float precio, int stock,
			int marcas_id, int categorias_id) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.codigo = codigo;
		this.fecha_creacion = fecha_creacion;
		this.precio = precio;
		this.stock = stock;
		this.marcas_id = marcas_id;
		this.categorias_id = categorias_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMarcas_id() {
		return marcas_id;
	}

	public void setMarcas_id(int marcas_id) {
		this.marcas_id = marcas_id;
	}

	public int getCategorias_id() {
		return categorias_id;
	}

	public void setCategorias_id(int categorias_id) {
		this.categorias_id = categorias_id;
	}

}
