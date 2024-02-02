package br.com.evento.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.evento.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {
	Evento findByCodigo(long codigo);
}
