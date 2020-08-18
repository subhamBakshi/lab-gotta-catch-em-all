package model;


//PROGRESSION - 4
//Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Dragonite must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Dragonite
//pokemonNumber = 149
//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."
//type = "DRAGON"
//evolution = "DRATINI"
//baseExp = "270" 

public class Dragonite extends Pokemon
{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	public final String getCharacteristics() {
		return characteristics;
	}
	public final void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}
	public final String getEvolution() {
		return evolution;
	}
	public final void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	public final String getBaseExp() {
		return baseExp;
	}
	public final void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
	public Dragonite(String pkname, int pknum, String chr, String typ, String evol, String Base)
	{
		super(pkname, pknum);
		characteristics = chr;
		type = typ;
		evolution = evol;
		baseExp = Base;
		
		pkname = "Dragonite";
		pknum = 149;
		chr = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		typ = "DRAGON";
		evol = "DRATINI";
		Base = "270";
	}
}