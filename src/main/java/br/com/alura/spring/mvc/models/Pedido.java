package br.com.alura.spring.mvc.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Pedido")
@Getter
@Setter
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDeEntrega;
	
	@Column(length = 600)
	private String urlImagem;
	@Column(length = 600)
	private String urlProduto;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
}
