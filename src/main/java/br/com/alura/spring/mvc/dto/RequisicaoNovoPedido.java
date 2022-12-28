package br.com.alura.spring.mvc.dto;

import br.com.alura.spring.mvc.models.Pedido;
import br.com.alura.spring.mvc.models.StatusPedido;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoNovoPedido {

	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImagem;
	private String descricao;
	
	public Pedido toPedido() {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setDescricao(descricao);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		
		return pedido;
	}

	@Override
	public String toString() {
		return "RequisicaoNovoPedido [nomeProduto=" + nomeProduto + ", urlProduto=" + urlProduto + ", urlImagem="
				+ urlImagem + ", descricao=" + descricao + "]";
	}
}
