package com.trivadis.wareneingangsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trivadis.wareneingangsservice.domain.Artikel;
import com.trivadis.wareneingangsservice.repository.ArtikelRepository;
import com.trivadis.wareneingangsservice.service.MaterialstammService;

@RestController
public class ArtikelController {

	@Autowired
	private ArtikelRepository artikelRepository;

	@Autowired
	private MaterialstammService materialstammService;

	private List<MaterialstammDTO> materialstammDTOs;

	@PostMapping("/artikel")
	public Artikel wareneingang(@RequestBody Artikel artikel) {
		if (materialstammDTOs == null) {
			materialstammDTOs = materialstammService.findAll();
		}

		MaterialstammDTO dto = materialstammDTOs.stream().filter(m -> m.getId().equals(artikel.getMaterialstammId()))
				.findFirst().orElse(null);

		if (dto != null) {
			return artikelRepository.save(artikel);
		} else {
			return null;
		}
	}
}
