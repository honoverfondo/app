package mz.gov.misau.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mz.gov.misau.app.model.Marca;

@Repository
@Transactional
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
