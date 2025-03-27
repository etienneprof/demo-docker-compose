package fr.m2i.docker_with_database.service;

import fr.m2i.docker_with_database.entity.Patisserie;

import java.util.List;

public interface PatisserieService {
    public List<Patisserie> findAll();
    public void save(Patisserie patisserie);
}
