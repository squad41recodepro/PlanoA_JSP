package Model;

public class Plano {

	protected int idPlano;
	protected String nomeDaAula;
	protected String materia;
	protected String serie;

	public Plano(int idPlano, String nomeDaAula, String materia, String serie) {
		super();
		this.idPlano = idPlano;
		this.nomeDaAula = nomeDaAula;
		this.materia = materia;
		this.serie = serie;
	}

	public Plano() {

	}

	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public String getNomeDaAula() {
		return nomeDaAula;
	}

	public void setNomeDaAula(String nomeDaAula) {
		this.nomeDaAula = nomeDaAula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}
