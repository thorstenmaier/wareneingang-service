package com.trivadis.wareneingangsservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artikel {

	@Id
	@GeneratedValue
	private Long id;

	private Long materialstammId;

	private Long lagerplatzId;

	public Artikel() {
		super();
	}

	public Artikel(Long materialstammId, Long lagerplatzId) {
		this.materialstammId = materialstammId;
		this.lagerplatzId = lagerplatzId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMaterialstammId() {
		return materialstammId;
	}

	public void setMaterialstammId(Long materialstammId) {
		this.materialstammId = materialstammId;
	}

	public Long getLagerplatzId() {
		return lagerplatzId;
	}

	public void setLagerplatzId(Long lagerplatzId) {
		this.lagerplatzId = lagerplatzId;
	}

	@Override
	public String toString() {
		return "Artikel [id=" + id + ", materialstammId=" + materialstammId + ", lagerplatzId=" + lagerplatzId + "]";
	}

}
