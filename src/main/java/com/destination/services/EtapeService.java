package com.destination.services;

import com.destination.entities.Etape;
import com.destination.entities.Lien;
import com.destination.repositories.EtapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtapeService {
    @Autowired
    private EtapeRepository etapeRepository;

    public List<Lien> findAllLiens(Long idEtape) {
        return etapeRepository.findById(idEtape).get().getLiens();
    }
}
