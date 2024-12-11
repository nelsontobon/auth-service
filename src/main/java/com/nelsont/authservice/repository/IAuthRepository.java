package com.nelsont.authservice.repository;

import com.nelsont.authservice.entity.Game;
import org.springframework.data.repository.CrudRepository;

public interface IAuthRepository extends CrudRepository<Game, Long> {
}
