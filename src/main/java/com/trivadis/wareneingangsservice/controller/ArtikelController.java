package com.trivadis.wareneingangsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.trivadis.wareneingangsservice.domain.Artikel;
import com.trivadis.wareneingangsservice.repository.ArtikelRepository;

@RestController
public class ArtikelController {

	@Autowired
	private ArtikelRepository artikelRepository;

	@PostMapping("/artikel")
	public Artikel wareneingang(@RequestBody Artikel artikel) {

		MaterialstammDTO dto = new RestTemplate().getForObject("http://localhost:8080/materialstamm/{id}",
				MaterialstammDTO.class, artikel.getMaterialstammId());

		if (dto != null) {
			return artikelRepository.save(artikel);
		} else {
			return null;
		}
	}
}
