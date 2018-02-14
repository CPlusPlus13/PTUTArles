package com.ptut.projetptut_v1.Semantique;

public class Application{

	private final int max = 100;
	private Niveau niveauTab[] = new Niveau[max];
	private Tclassique tuileSauv;
	private int nbNiveau;
	private int idNiveauCourant;
	private int idPanneauCourant;

	public Application(){

		this.tuileSauv = null;
		this.nbNiveau = 0;
		this.idNiveauCourant = 0;
		this.idPanneauCourant = 0;
	}

	public Tclassique gettuileSauv(){

		return this.tuileSauv;
	}

	public void settuileSauv(Tclassique tuileSauv_){

		this.tuileSauv = tuileSauv_;
	}

	public int getnbNiveau(){

		return this.nbNiveau;
	}

	public void setnbNiveau(int nbNiveau_){

		this.nbNiveau = nbNiveau_;
	}

	public int getidNiveauCourant(){

		return this.idNiveauCourant;
	}

	public void setidNiveauCourant(int idNiveauCourant_){

		this.idNiveauCourant = idNiveauCourant_;
	}

	public int getidPanneauCourant(){

		return this.idPanneauCourant;
	}

	public void setidPaneauCourant(int idPanneauCourant_){

		this.idPanneauCourant = idPanneauCourant_;
	}

	public void AjouterNiveau(int idNiveau_, int idPere_){

		if(nbNiveau<max){
			niveauTab[nbNiveau] = new Niveau(nbNiveau+1, 0);
			nbNiveau++;
		}
		else{

			System.out.println("Nombre de niveau max atteint!");
		}
	}

	public void AfficherNiveauCourant(){

		for(int i=0; i<nbNiveau; i++){

			if(niveauTab[i].getidNiveau()==idNiveauCourant){

				niveauTab[i].AfficherNiveau(idPanneauCourant);
			}
		}
	}
}