package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	private int codigo;
	Tipo(int codigo) {
		this.codigo = codigo;

	}
}
