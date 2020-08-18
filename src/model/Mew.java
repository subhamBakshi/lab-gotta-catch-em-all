package model;

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 


public class Mew extends Pokemon
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
	
	public Mew(String pkname, int pknum, String chr, String typ, String evol, String Base)
	{
		super(pkname, pknum);
		characteristics = chr;
		type = typ;
		evolution = evol;
		baseExp = Base;
		
		pkname = "Mew";
		pknum = 151;
		chr = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		typ = "PSYCHIC";
		evol = "NONE";
		Base = "64";
	}
}