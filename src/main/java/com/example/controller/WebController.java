package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Proveedor;
import com.example.repository.ProveedorRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/proveedor")
public class WebController {
	
  @Autowired
  private ProveedorRepository repository;

  @GetMapping
  public List<Proveedor> getProvedores(){
	  return repository.findAll();
  }
  
  @PostMapping
  public void addProvedor(@RequestBody Proveedor p){
	  repository.save(p);
  }

  @DeleteMapping(value = "/{id}")
  public void deleteProvedor(@PathVariable long id){
	  repository.deleteById(id);
  } 

  @GetMapping(value = "/{id}")
  public Object getProvedor(@PathVariable long id){
	  return repository.findById(id);
  }
  
  @PutMapping
  public void UpdateProvedor(@RequestBody Proveedor p){
	  repository.saveAndFlush(p);
  } 
  
}
