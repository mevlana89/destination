package com.destination.services;

import com.destination.entities.Etape;
import com.destination.repositories.DestinationRepository;
import com.destination.repositories.EtapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository destinationRepository;
    @Autowired
    private EtapeRepository etapeRepository;
    public List<Etape> findAllEtapes(Long idDestionation) {

        return destinationRepository.findById(idDestionation).get().getEtapes();
    }
}
