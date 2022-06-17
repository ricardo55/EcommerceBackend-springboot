package org.generation.ecommercedb.service;

import org.generation.ecommercedb.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface RegistroRepository extends JpaRepository<Registro, Long> {

    //@Query("SELECT u FROM registro u WHERE u.username=?1")
    //Optional<Registro> findByUsername(String username);


}
