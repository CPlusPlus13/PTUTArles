package com.ptut.projetptut_v1.Semantique;

public class Panneau{

	private int idNiveau;
	private int idPanneau;
	private int nbTuile;
	private Tclassique tuileTab[] = new Tclassique[6];

	public Panneau(int idNiveau_, int idPanneau_){

		this.idNiveau = idNiveau_;
		this.idPanneau = idPanneau_;
		this.nbTuile = 0;
	}

	public int getidNiveau(){

		return this.idNiveau;
	}

	public void setidNiveau(int idNiveau_){

		this.idNiveau = idNiveau_;
	}

	public int getidPanneau(){

		return this.idPanneau;
	}

	public void setidPanneau(int idPanneau_){

		this.idPanneau = idPanneau_;
	}

	public int getnbTuile(){

		return this.nbTuile;
	}

	public void setnbTuile(int nbTuile_){

		this.nbTuile = nbTuile_;
	}

	public void AfficherPanneau(){

		for(int i=0; i<nbTuile; i++){

			tuileTab[i].AfficherTuile();
		}
	}

	public void AjouterTuile(String phrase_){

		if(nbTuile<6){

			tuileTab[nbTuile] = new Tclassique(getidNiveau(), getidPanneau(), getnbTuile()+1, phrase_);
			nbTuile++;
		}
		else{

			System.out.println("il y a deja 6 tuiles!");
		}
	}

	public void ModifierTuile(int idTuile_, String phrase_){

		for(int i=0; i<nbTuile; i++){

			if(tuileTab[i].getidTuile()==idTuile_){

				tuileTab[i].setPhrase(phrase_);
			}
			else{

				System.out.println("Tuile introuvable");
			}
		}
	}

	public void SuprimerTuile(int idTuile_){

		if(idTuile_>0 && idTuile_<nbTuile-1){

			if(idTuile_==nbTuile-1){

				nbTuile--;
			}
			else{

				tuileTab[idTuile_-1] = tuileTab[nbTuile-1]; //Remplace la tuile supprimée par la dernière tuile dans le tableau
				nbTuile--;
			}
		}
		else{

			System.out.println("Erreur dans l'idTuile!");
		}
	}
}