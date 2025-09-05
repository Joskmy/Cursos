package com.platzi.pizzeria.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "id_customer", nullable = false, length = 15)
    private String id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(length = 50, unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
}
