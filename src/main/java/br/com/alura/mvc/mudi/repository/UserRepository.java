package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.mvc.mudi.model.User;
import br.com.alura.mvc.mudi.model.Pedido;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
}
