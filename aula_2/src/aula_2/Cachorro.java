package aula_2;

public class Cachorro {
public String nome;
public String raca; 
public int idade; 
public String cor;

public void Latir () {
	System.out.println("o cachorro:" + nome + "latiu ");
}
public void GetCachorro() {
	System.out.println(
			"nome: "+ nome +
			"\nRaça: " + idade +
			"\nCor: " + cor
			); 
	
 }
}
