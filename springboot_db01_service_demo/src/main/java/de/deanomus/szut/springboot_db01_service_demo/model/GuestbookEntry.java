package de.deanomus.szut.springboot_db01_service_demo.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Entry")
public class GuestbookEntry {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;




}
