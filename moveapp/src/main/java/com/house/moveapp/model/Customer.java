package com.house.moveapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String  name;
private String email;
private String phone;

}
