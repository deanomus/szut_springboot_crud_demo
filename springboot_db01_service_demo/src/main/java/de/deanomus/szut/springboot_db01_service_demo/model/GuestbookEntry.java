package de.deanomus.szut.springboot_db01_service_demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Entry")
public class GuestbookEntry {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String
                title,
                comment,
                commenter;
    private Date date = new Date();




}
