package mz.gov.misau.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.gov.misau.app.model.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
