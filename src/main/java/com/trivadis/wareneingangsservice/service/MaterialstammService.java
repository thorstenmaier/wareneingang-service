package com.trivadis.wareneingangsservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.trivadis.wareneingangsservice.controller.MaterialstammDTO;

@FeignClient(value = "MATERIALSTAMMDATENSERVICE")
public interface MaterialstammService {

	@GetMapping("/materialstamm/{id}")
	MaterialstammDTO findById(@PathVariable("id") Long id);

	@GetMapping("/materialstamm")
	List<MaterialstammDTO> findAll();

}
