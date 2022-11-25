package com.fpt.gps.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arch")
public class Location implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public double latitude;
    public double longitude;

}
