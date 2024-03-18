package org.example.repository;

import org.example.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepositoy extends MongoRepository<Client, String> {
}
