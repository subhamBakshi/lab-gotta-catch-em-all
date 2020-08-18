package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon{
	String pokemonName;
	int pokemonNumber;
	
	public final String getPokemonName() {
		return pokemonName;
	}
	
	public final void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	
	public final int getPokemonNumber() {
		return pokemonNumber;
	}
	
	public final void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
	public Pokemon(String pkname, int pknum)
	{
		pokemonName = pkname;
		pokemonNumber = pknum;
	}
}

