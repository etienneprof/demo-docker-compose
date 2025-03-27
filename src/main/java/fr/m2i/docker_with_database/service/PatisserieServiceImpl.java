package fr.m2i.docker_with_database.service;

import fr.m2i.docker_with_database.entity.Patisserie;
import fr.m2i.docker_with_database.repository.PatisserieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatisserieServiceImpl implements PatisserieService {
    private final PatisserieRepository patisserieRepository;

    @Autowired
    PatisserieServiceImpl(PatisserieRepository patisserieRepository) {
        this.patisserieRepository = patisserieRepository;
    }

    public List<Patisserie> findAll() {
        return patisserieRepository.findAll();
    }

    public void save(Patisserie patisserie) {
        patisserieRepository.save(patisserie);
    }
}
