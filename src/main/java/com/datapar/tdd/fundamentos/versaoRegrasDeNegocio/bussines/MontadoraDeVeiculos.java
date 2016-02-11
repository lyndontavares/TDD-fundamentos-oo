package com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines;

import java.util.ArrayList;
import java.util.List;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.model.Motor;
import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.model.Passeio;

public class MontadoraDeVeiculos {

	private int quantidadeDeVeiculosMontados;
	private int capacidadeDeVeiculosAMontar;

	public MontadoraDeVeiculos (int capacidadeDeVeiculosAMontar) throws Exception {

		if (capacidadeDeVeiculosAMontar <= 0) {
			throw new Exception("Capacidade de veiculos a montar deve ser maior que zero!");
		}

		if (capacidadeDeVeiculosAMontar > 1000) {
			throw new Exception("Capacidade de veiculos a montar deve ser maior menor ou igual a 1000!");
		}

		quantidadeDeVeiculosMontados = 0;
		this.capacidadeDeVeiculosAMontar = capacidadeDeVeiculosAMontar;
		
	}

	public int getQuantidadeDeVeiculosMontados() {
		return quantidadeDeVeiculosMontados;
	}

	public int getCapacidadeDeVeiculosAMontar() {
		return capacidadeDeVeiculosAMontar;
	}

	public List<Passeio> montarVeiculos(int quantidade) throws Exception {
		
		if ( quantidadeDeVeiculosMontados + quantidade > capacidadeDeVeiculosAMontar ){
			throw new Exception("Excede capacidade de fabricacao: "+capacidadeDeVeiculosAMontar+" veiculos");
		}
		
		List<Passeio> ListaDeveiculos = new ArrayList<Passeio>();
		
		for (int n = 1; n <= 10; n++) {
			ListaDeveiculos.add(new Passeio("PLACA" + n, "FORD", "FIESTA", 200, new Motor(4, 200), 5));
		}
		
		return ListaDeveiculos;
	}

}
