package com.rebelizant.bookworm.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rebelizant on 27.01.15.
 */
@Entity
public class User {

    @Id
    private long id;

    @Column
    private String name;

}
