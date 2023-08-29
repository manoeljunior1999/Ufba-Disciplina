package Disciplina;

public class Disciplina {

	private String nomeDisc;
	private String codigoDisc;
	private int credito;
	private int cargaHoraria;

	public void Discplina(String nomeDisc, String codigoDisc, int credito, int cargaHoraria) {
		this.nomeDisc = nomeDisc;
		this.codigoDisc = codigoDisc;
		this.credito = credito;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNomeDisc() {
		return this.nomeDisc;
	}

}
