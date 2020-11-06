package io.github.carolsimoes.agendaapi.model.repository;


import io.github.carolsimoes.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
