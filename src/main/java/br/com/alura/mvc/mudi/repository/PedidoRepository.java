package br.com.alura.mvc.mudi.repository;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository extends JpaRepository<Pedido, Long> {
	
}
