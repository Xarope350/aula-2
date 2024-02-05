package aula_2;

public class Pedrin {

	public String Nome; 
	public String Apelido; 
	public int Idade; 
    public int altura;
    

public void Conversar () {

	System.out.println("O Pedrin:" + Nome + "conversou ");
}

public void Critica () {

	System.out.println("O Pedrin:" + Nome + "criticou ");
}
public void Falar_De_Mulher () {

	System.out.println("O Pedrin:" + Nome + "Falou sobre femeas");
}

public void Falar_sobre_jogos () {

	System.out.println("O Pedrin:" + Nome + "Falou sobre games fodas ");
}
public void Falar_sobre_a_vida () {

	System.out.println("O Pedrin:" + Nome + "Ele ficou com depressação ");
}

public void GetCachorro() {
	System.out.println(
			"Nome: "+ Nome +
			"\nApelido: " + Apelido +
			"\nCor: " + Idade
			); 
	
 }
}

