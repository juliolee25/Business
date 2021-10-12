package com.moving.springbootmoving.repositories;

import com.moving.springbootmoving.models.Box;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBoxRepository extends CrudRepository<Box, Long> {
}
