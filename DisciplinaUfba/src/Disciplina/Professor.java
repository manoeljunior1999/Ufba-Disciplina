package Disciplina;

import java.util.*;

public class Professor {

	private String nome, titulacao, depto;
	private ArrayList<Disciplina> disciplina= new ArrayList<Disciplina>()

	public Professor(
	String nome, String titulacao,
	String depto)
	{
		this.nome = nome;
		this.titulacao = titulacao;
		this.depto = depto;
	}

	public void incluirDisc(Disciplina disc) {
		disciplinas.add(disc);
	}

	public void listaDiscProf(){
    int contador;
    Disciplina disc;
    System.out.println("Prof=" + getNome()+ "ensina");
    for (contador=0; contador < disciplina.size(); contador++){
      dis=disciplinas.get(contador);
      System.out.println(disc.getNomeDisc());}

      System.out.println("com interator");

    System.out.println("Prof=" + getNome()+ "ensina: ");
    for (Interator<Disciplina> it = disciplinas.iterator(); it.hasnext();
         disc=it.next();
        System.out.println();
        

    
    
  }

}