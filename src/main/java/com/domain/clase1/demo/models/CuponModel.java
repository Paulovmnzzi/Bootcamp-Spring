package com.domain.clase1.demo.models;

import java.util.Date;

public class CuponModel {

	private int id;
	private String nombre;
	private String codigo;
	private Date fecha_vigencia_desde;
	private Date fecha_vigencia_hasta;
	private float descuento;

	public CuponModel(int id, String nombre, String codigo, Date fecha_vigencia_desde, Date fecha_vigencia_hasta,
			float descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.fecha_vigencia_desde = fecha_vigencia_desde;
		this.fecha_vigencia_hasta = fecha_vigencia_hasta;
		this.descuento = descuento;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha_vigencia_desde() {
		return fecha_vigencia_desde;
	}

	public void setFecha_vigencia_desde(Date fecha_vigencia_desde) {
		this.fecha_vigencia_desde = fecha_vigencia_desde;
	}

	public Date getFecha_vigencia_hasta() {
		return fecha_vigencia_hasta;
	}

	public void setFecha_vigencia_hasta(Date fecha_vigencia_hasta) {
		this.fecha_vigencia_hasta = fecha_vigencia_hasta;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

}
