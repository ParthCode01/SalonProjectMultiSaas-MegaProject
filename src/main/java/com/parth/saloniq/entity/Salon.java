package com.parth.saloniq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name of Salon is needed")
    private String name;

    @Email(message = "email of Salon is needed")
    @NotBlank(message = "email of Salon is needed")
    private String email;

    @NotNull(message = "phone of Salon is needed")
    @Size(min = 10, max = 10, message = "phone number must be of 10 digits")
    private String phone;

    @NotBlank(message = "address of Salon is needed")
    private String address;
}
