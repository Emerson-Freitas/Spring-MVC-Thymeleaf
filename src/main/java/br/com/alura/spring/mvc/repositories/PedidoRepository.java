package br.com.alura.spring.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.mvc.models.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
