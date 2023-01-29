package mz.gov.misau.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.gov.misau.app.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
