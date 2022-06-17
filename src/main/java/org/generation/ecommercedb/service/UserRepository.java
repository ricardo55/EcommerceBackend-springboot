package org.generation.ecommercedb.service;
import java.util.Optional;
import org.generation.ecommercedb.model.User;//importamos la clase de nuestro model (user)
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> { //Extendemos de JPA para poder hacer nuestra tabla.
	
	@Query("SELECT u FROM User u WHERE u.username=?1")
	Optional<User> findByUsername(String username); 
	

}//interface