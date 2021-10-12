package com.moving.springbootmoving.repositories;

import com.moving.springbootmoving.models.Helper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHelperRepository extends CrudRepository<Helper, Long> {
}
