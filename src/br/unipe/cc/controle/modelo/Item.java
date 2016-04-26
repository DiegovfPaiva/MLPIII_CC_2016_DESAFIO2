package br.unipe.cc.controle.modelo;

public class Item implements Comparable<Item> {
	protected int id;
	protected String descricao;
	protected double preco;
	
	public Item(int id, String descricao, double preco){
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getDescricao(){
		return descricao;
		
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
		
	}
	public double getPreco(){
		return preco;
		
	} 
	public void setPreco(double preco ){
		this.preco = preco;
	}
	
	
	
	@Override
	public String toString() {
		return " id=" + id + ", descricao=" + descricao ;
	}
	
	public int compareTo(Item outro) {
		if(this.id>outro.id)
			return 1;
		if(this.id<outro.id)
			return -1;
		return 0;
     }
	
}