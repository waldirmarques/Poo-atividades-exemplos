package ufpb.br.Singleton;

public class FachadaHsqlDb extends FachadaBD {

	public static FachadaHsqlDb getInstance() {
		if (instance == null) {
			instance = new FachadaHsqlDb();
		}

		return (FachadaHsqlDb) instance;

	}

	private String directory;

}
