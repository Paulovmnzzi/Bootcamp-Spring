package com.domain.clase1.demo.controllers;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.clase1.demo.models.ArticuloModel;
import com.domain.clase1.demo.services.ArticuloService;

@RestController
@RequestMapping("/Articulos")
public class ArticuloController {
	
	private ArticuloService articuloBussiness = new ArticuloService();
	
	@GetMapping()
	public ArrayList<ArticuloModel> getArticulo() {
		return articuloBussiness.getArticulos();
	}

	@GetMapping(path = "/{id}")
	public ArticuloModel getUsuario(@PathVariable("id")Integer id) {
		
		return articuloBussiness.getArticulo(id);
	}
	
	@PostMapping()
	public ArticuloModel insertarUsuario(@RequestBody ArticuloModel articulo) {
		return articuloBussiness.insertarArticulo(articulo);
	}
	
	@DeleteMapping(path = "{id}")
	public ArticuloModel deleteArticulo(@PathVariable("id")Integer id) {
		return articuloBussiness.deleteArticulo(id);
	}
	
	@PutMapping(path = "/{id}")
	public ArticuloModel updateArticulo (@RequestBody ArticuloModel articulo, @PathVariable("id")Integer id) {
		return articuloBussiness.modificarArticulo(id, articulo);
	}
	
}
