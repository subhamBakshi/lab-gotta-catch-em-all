package model;

/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */


public class Pikachu extends Pokemon
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
	
	public Pikachu(String pkname, int pknum, String chr, String typ, String evol, String Base)
	{
		super(pkname, pknum);
		characteristics = chr;
		type = typ;
		evolution = evol;
		baseExp = Base;
		
		pkname = "Pikachu"; 
		pknum = 25;
		chr = "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchisemascot."; 
		typ = "ELECTRIC"; 
		evol = "RAICHU"; 
		Base = "112";
	}
}