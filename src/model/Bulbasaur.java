package model;
// import model.Pokemon;

//PROGRESSION - 2 
//Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 



public class Bulbasaur extends Pokemon{
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
	
	public Bulbasaur(String pkname, int pknum, String chr, String typ, String evol, String Base)
	{
		super(pkname, pknum);
		characteristics = chr;
		type = typ;
		evolution = evol;
		baseExp = Base;
		
		pkname= "Bulbasaur";
		pknum= 001;
		chr="Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region ";
		typ="poison";
		evol = "IVYSAUR";
		Base = "64";
		
	} 
}