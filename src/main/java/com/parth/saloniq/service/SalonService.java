package com.parth.saloniq.service;


import com.parth.saloniq.entity.Salon;
import com.parth.saloniq.repository.SalonRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalonService {

    private final SalonRepo salonRepo;

    public SalonService(SalonRepo salonRepo){
        this.salonRepo = salonRepo;
    }

    public Salon getSalonById(Long id){
        Salon salon = salonRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Salon not found"));
        return salon;
    }
    public Salon createSalon(Salon salon){
       return salonRepo.save(salon);

    }
    public List<Salon> getAllSalons(){

        return salonRepo.findAll();

    }
    public void deleteSalon(Long id){
        salonRepo.deleteById(id);
    }

    public Salon updateSalonById(Long id , Salon salon){
        Salon exisitingSalon = salonRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Salon with given id not found"));

        exisitingSalon.setName(salon.getName());
        exisitingSalon.setEmail(salon.getEmail());
        exisitingSalon.setPhone(salon.getPhone());
        exisitingSalon.setAddress(salon.getAddress());

        return salonRepo.save(exisitingSalon);
    }
}
