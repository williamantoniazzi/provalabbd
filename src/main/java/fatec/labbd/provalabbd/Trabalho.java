package fatec.labbd.provalabbd;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.usertype.Sized;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "tra_trabalho")
public class Trabalho {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_id")
    private Long id;
    
    @NotEmpty(message="Valor não pode ser nulo")
    @Size(max=100, message="Valor não pode ser maior que 100")
    @Column(name = "tra_titulo")
    private String titulo;
    
    @NotNull(message="A data não deve ser nula")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
    @Column(name = "tra_data_hora_entrega")
    private Date data_hora;

    @Not



	
	
	//Getters and Setters
	public Long getIdEstacaibr() {
		return idEstacaibr;
	}
	public void setIdEstacaibr(Long idEstacaibr) {
		this.idEstacaibr = idEstacaibr;
	}
	public String getNomeEstacao() {
		return nomeEstacao;
	}
	public void setNomeEstacao(String nomeEstacao) {
		this.nomeEstacao = nomeEstacao;
	}
	public BigDecimal getLatitudeEstacao() {
		return latitudeEstacao;
	}
	public void setLatitudeEstacao(BigDecimal latitudeEstacao) {
		this.latitudeEstacao = latitudeEstacao;
	}
	public BigDecimal getLongitudeEstacao() {
		return longitudeEstacao;
	}
	public void setLongitudeEstacao(BigDecimal longitudeEstacao) {
		this.longitudeEstacao = longitudeEstacao;
	}
	public BigDecimal getAltitudeEstacao() {
		return altitudeEstacao;
	}
	public void setAltitudeEstacao(BigDecimal altitudeEstacao) {
		this.altitudeEstacao = altitudeEstacao;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	
	//Metodos
	

}


