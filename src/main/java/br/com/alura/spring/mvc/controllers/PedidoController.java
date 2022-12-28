package br.com.alura.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.spring.mvc.dto.RequisicaoNovoPedido;
import br.com.alura.spring.mvc.models.Pedido;
import br.com.alura.spring.mvc.repositories.PedidoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "/pedido/formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
			
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		System.out.println(pedido.getNomeProduto());
		
		return "redirect:/home";
	}
	
}
