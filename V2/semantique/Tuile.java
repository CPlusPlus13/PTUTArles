package com.ptut.projetptut_v1.Semantique;

public abstract class Tuile{

	protected int idTuile;
	//private image;

	public Tuile(int idTuile_){

		this.idTuile = idTuile_;
	}

	public int getidTuile(){

		return this.idTuile;
	}

	public void setidTuile(int idTuile_){

		this.idTuile = idTuile_;
	}


	public void AfficherTuile(){

	}
}