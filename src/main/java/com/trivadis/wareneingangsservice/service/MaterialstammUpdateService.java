package com.trivadis.wareneingangsservice.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MaterialstammUpdateService {

	@JmsListener(destination = "materialstamm")
	public void updateMaterialstamm(Long id) {
		System.out.println("Materialstammupdate: " + id);
	}
}
