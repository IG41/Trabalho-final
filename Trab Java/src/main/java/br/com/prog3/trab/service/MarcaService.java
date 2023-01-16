package br.com.prog3.trab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.trab.domain.Marca;
import br.com.prog3.trab.repository.MarcaRepository;

@RestController
@RequestMapping("/trabalho/marcas")
@Service
public class MarcaService {
	@Autowired
	private MarcaRepository marcaRepository;
	public Marca save(Marca marca) {
	return marcaRepository.save(marca);
	}
	public List<Marca> findAll(){
	return (List<Marca>) marcaRepository.findAll();
	}
	public Optional<Marca> findById(Long id) {
	return marcaRepository.findById(id);
	}
	public Marca update(Marca marca) {
	return marcaRepository.save(marca);
	}
	public void deleteById(Long id) {
	marcaRepository.deleteById(id);
	}
}
