package com.domain.clase1.demo.services;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.domain.clase1.demo.models.ArticuloModel;

@Service
public class ArticuloService {

	private ArrayList<ArticuloModel> articulos = new ArrayList<>();
	private int contador = 0;
	
	public ArticuloModel getArticle(Integer id) {
		return (ArticuloModel) articulos.stream().filter(x -> x.getId() == id).toArray()[0];
	}
	
	public ArrayList<ArticuloModel> getArticle(){
		return articulos;
	}

	public ArticuloModel insertarArticulo(ArticuloModel articulo) {
		contador++;
		articulo.setId(contador);
		articulos.add(articulo);
		return articulo;
	}
	
	public ArticuloModel deleteArticulo(int id) {
		ArticuloModel articulo = (ArticuloModel) articulos.stream().filter(x -> x.getId() == id).toArray()[0];
		articulos = (ArrayList<ArticuloModel>) articulos.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
		return articulo;
	}
	
	public ArticuloModel modificarArticulo(int id, ArticuloModel articulo) {
		ArticuloModel articuloBD = (ArticuloModel) articulos.stream().filter(x -> x.getId() == id).toArray()[0];
		int index = articulos.indexOf(articuloBD);
		articulos.set(index, articulo);
		return articulo;
		
	}
	
}
