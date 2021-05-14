package breno.com.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import breno.com.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
