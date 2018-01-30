package com.poe.trajetfacile.repository;

import com.poe.trajetfacile.domain.Ride;
import com.poe.trajetfacile.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {

}
