package com.fpt.gps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fpt.gps.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {}
