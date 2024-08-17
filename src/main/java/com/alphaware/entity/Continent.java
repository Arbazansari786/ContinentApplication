package com.alphaware.entity;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.JoinColumn;

@Entity
@ToString
@Setter
@Getter
public class Continent {

	@Id
	private String code;
	private String name;
	private Long areaSqKm;
	private Long population;
	private Integer countries;

	@ElementCollection
	@CollectionTable(name = "continent_lines", joinColumns = @JoinColumn(name = "continent_code"))
	@Column(name = "line")
	private Set<String> lines;

	@ElementCollection
	@CollectionTable(name = "continent_oceans", joinColumns = @JoinColumn(name = "continent_code"))
	@Column(name = "ocean")
	private Set<String> oceans;

	@ElementCollection
	@CollectionTable(name = "continent_developed_countries", joinColumns = @JoinColumn(name = "continent_code"))
	@Column(name = "developed_country")
	private Set<String> developedCountries;

}
