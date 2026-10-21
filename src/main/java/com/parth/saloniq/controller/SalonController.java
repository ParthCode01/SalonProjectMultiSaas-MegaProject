package com.parth.saloniq.controller;


import com.parth.saloniq.entity.Salon;
import com.parth.saloniq.service.SalonService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salon")
public class SalonController {

    private final SalonService salonService;

    public SalonController(SalonService salonService){
        this.salonService = salonService;
    }

    @GetMapping("/{id}")
    public Salon getSalonById(@PathVariable Long id){
        return salonService.getSalonById(id);
    }

    @GetMapping
    public List<Salon> getAllSalons(){
        return salonService.getAllSalons();
    }

    @PostMapping
    public Salon createSalon(@Valid @RequestBody Salon salon){
        return salonService.createSalon(salon);
    }

    @DeleteMapping("/{id}")
    public void deleteSalon(@PathVariable Long id){
        salonService.deleteSalon(id);
    }

    @PutMapping("/{id}")
    public Salon updateSalon(
            @Valid @PathVariable Long id,
            @Valid @RequestBody Salon salon
    ) {
        return salonService.updateSalonById(id, salon);
      }


}
