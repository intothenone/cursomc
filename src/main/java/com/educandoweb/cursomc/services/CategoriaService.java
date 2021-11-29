package com.educandoweb.cursomc.services;

import java.util.Optional;

import javax.xml.bind.DataBindingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.educandoweb.cursomc.domain.Categoria;
import com.educandoweb.cursomc.repositories.CategoriaRepository;
import com.educandoweb.cursomc.services.exceptions.DataIntegrityExeception;
import com.educandoweb.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) { 
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));  
		} 
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		try {
		repo.deleteById(id);			
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityExeception("Não é possível excluir uma categoria que possua produtos");
		}
	}


}
