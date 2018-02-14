package com.ptut.projetptut_v1.Semantique;

public class Tclassique extends Tuile {

	private int idNiveau;
	private int idPanneau;
	private String phrase;
	//private son;

	public Tclassique(int idNiveau_, int idPanneau_, int idTuile_, String phrase_){

		super(idTuile_);
		this.idNiveau = idNiveau_;
		this.idPanneau = idPanneau_;
		this.phrase = phrase_;
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

	public String getPhrase(){

		return this.phrase;
	}

	public void setPhrase(String phrase_){

		this.phrase = phrase_;
	}

	@Override
	public void AfficherTuile(){

		System.out.println(idTuile + " " + phrase);
	}
}