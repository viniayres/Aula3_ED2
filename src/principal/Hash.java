package principal;

import java.util.ArrayList;

public class Hash {
	private ArrayList<Integer>[] lista;
	private int tam;
	
	public Hash(int m){
		tam = m;
		lista = new ArrayList[m];	
		for(int i = 0; i < m; i++){
			lista[i] = new ArrayList<Integer>();
		}
	}
	
	public ArrayList<Integer>[] getLista(){
		return this.lista;
	}
	
	public ArrayList<Integer> getContainer(int n){
		return this.lista[n];
	}
	
	public void addMod(int chave){
		int pos = chave % this.getLista().length;
		boolean colision;
		
		if(this.getContainer(pos).size() > 0){
			System.out.println("Colisao!");
		}
		
		this.getContainer(pos).add(chave);
	}
	
}
