package com.destination.services;

import com.destination.entities.Destination;
import com.destination.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> findAllDestinations()
    {
        return destinationRepository.findAll();
    }

    public void save(Destination destination)
    {
        destinationRepository.save(destination);
    }
}
