package com.moving.springbootmoving.repositories;

import com.moving.springbootmoving.models.Van;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVanRepository extends CrudRepository<Van, Long> {
}
