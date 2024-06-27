package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	//atributo
	private Map<Long, Produto> estoqueprodutosMap;

	public EstoqueProdutos() {
		this.estoqueprodutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueprodutosMap.put(cod, new Produto(nome, preco, quantidade));
		
	}
	
	public void exibirProdutos(){
		System.out.println(estoqueprodutosMap);
	}
	
	public double calcularValorTotalEstoque(){
		double valorTotalEstoque = 0d;
		if(!estoqueprodutosMap.isEmpty()) {
			for(Produto p : estoqueprodutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
			
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueprodutosMap.isEmpty()) {
			for(Produto p: estoqueprodutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			
		}
	}
		return produtoMaisCaro;
}
	
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
		estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
		estoque.adicionarProduto(8L, "Produto D", 2, 25.0);
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
	}
	
	
	
	
	
}