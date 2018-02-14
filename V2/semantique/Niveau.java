package com.ptut.projetptut_v1.Semantique;

public class Niveau{

	private int idNiveau;
	private int idPere;
	private int nbPanneau;
	private Panneau panneauTab[] = new Panneau[6];

	public Niveau(int idNiveau_, int idPere_){

		this.idNiveau = idNiveau_;
		this.idPere = idPere_;
		this.nbPanneau = 0;
	}

	public int getidNiveau(){

		return this.idNiveau;
	}

	public void setidNiveau(int idNiveau_){

		this.idNiveau = idNiveau_;
	}

	public int getidPere(){

		return this.idPere;
	}

	public void setidPere(int idPere_){

		this.idPere = idPere_;
	}

	public int getnbPanneau(){

		return this.nbPanneau;
	}

	public void setnbPanneau(int nbPanneau_){

		this.nbPanneau = nbPanneau_;
	}

	public Panneau getpanneauTab(int idPanneau_){

		for(int i=0; i<nbPanneau; i++){

			if(panneauTab[i].getidPanneau()==idPanneau_){

				return panneauTab[i];
			}
		}
		System.out.println("Le panneau choisi n'existe pas!");
		return null;
	}

	public void AfficherNiveau(int idPanneau_){

		for(int i=0; i<nbPanneau; i++){

			if(panneauTab[i].getidPanneau()==idPanneau_){

				panneauTab[i].AfficherPanneau();
			}
		}
	}

	public void AjouterPanneau(){

		if(nbPanneau<6){

			panneauTab[nbPanneau] = new Panneau(getidNiveau(), getnbPanneau()+1);
			nbPanneau++;
		}
		else{

			System.out.println("Erreur il y a deja 6 panneaux!");
		}
	}

	public void SupprimerPanneau(int idPanneau_){

		if(idPanneau_>0 && idPanneau_<nbPanneau-1){

			if(idPanneau_==nbPanneau-1){

				nbPanneau--;
			}
			else{

				panneauTab[idPanneau_-1] = panneauTab[idPanneau_-1]; //Remplace le panneau supprimé par le dernier panneau dans le tableau
				nbPanneau--;
			}
		}
		else{

			System.out.println("Erreur dans l'idPanneau!");
		}
	}
}