package com.parth.saloniq.repository;

import com.parth.saloniq.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepo extends JpaRepository<Salon, Long> {

}
