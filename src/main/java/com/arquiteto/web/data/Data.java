package com.arquiteto.web.data;

public class Data {
	int dia;
	int mes;
	int ano;
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public boolean anoBissesto(){
		return ( (ano%4==0 && ano%100!=0) || (ano%400==0) );
	}
	

}
