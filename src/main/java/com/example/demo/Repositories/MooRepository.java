package com.example.demo.Repositories;

import com.example.demo.Models.Moo;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface MooRepository extends CrudRepository<Moo, Long> {
}
