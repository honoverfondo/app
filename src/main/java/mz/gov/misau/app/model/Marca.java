package mz.gov.misau.app.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_marca",sequenceName = "seq_marca", allocationSize = 1,initialValue = 1)
public class Marca implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_marca")
	private long id;
	
	@Column(nullable = false,length = 60)
	private String descricao;
	
	private LocalDate dataMarcRegisto;

	@PrePersist
	public void prePersist() {
		setDataMarcRegisto(LocalDate.now());
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataMarcRegisto() {
		return dataMarcRegisto;
	}

	public void setDataMarcRegisto(LocalDate dataMarcRegisto) {
		this.dataMarcRegisto = dataMarcRegisto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return id == other.id;
	}
	
	//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
	//https://github.com/honoverfondo/app.git
}
