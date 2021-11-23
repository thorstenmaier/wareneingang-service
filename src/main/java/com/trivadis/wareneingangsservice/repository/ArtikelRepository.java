package com.trivadis.wareneingangsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trivadis.wareneingangsservice.domain.Artikel;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {

}
