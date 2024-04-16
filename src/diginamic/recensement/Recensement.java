package diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import diginamic.recensement.*;

public class Recensement {
	private List<Ville> villes = new ArrayList<>();

	void addVille(Ville ville) {
		villes.add(ville);

	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
