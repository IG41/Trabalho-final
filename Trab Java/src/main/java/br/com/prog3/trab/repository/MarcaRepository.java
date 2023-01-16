package br.com.prog3.trab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.trab.domain.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
