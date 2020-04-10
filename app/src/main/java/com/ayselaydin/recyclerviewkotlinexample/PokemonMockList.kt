package com.ayselaydin.recyclerviewkotlinexample

import com.ayselaydin.recyclerviewkotlinexample.model.PokemonModel

object PokemonMockList {
    fun getPokemonList(): List<PokemonModel> {
        val pokemonList: ArrayList<PokemonModel> = ArrayList()
        pokemonList.add(PokemonModel("Pikachu", R.drawable.pikachu))
        pokemonList.add(PokemonModel("Squirtle", R.drawable.squirtle))
        pokemonList.add(PokemonModel("Balbasaur", R.drawable.balbasaur))
        pokemonList.add(PokemonModel("Eevee", R.drawable.eevee))
        pokemonList.add(PokemonModel("Machoke Goriky", R.drawable.machoke_goriky))
        pokemonList.add(PokemonModel("Mankey", R.drawable.mankey))
        pokemonList.add(PokemonModel("Onix", R.drawable.onix))
        pokemonList.add(PokemonModel("Psyduck Koduck", R.drawable.psyduck_koduck))
        pokemonList.add(PokemonModel("Sword", R.drawable.sword))
        pokemonList.add(PokemonModel("Charizard", R.drawable.charizard))
        pokemonList.add(PokemonModel("Leafeon", R.drawable.leafeon))
        pokemonList.add(PokemonModel("Pidgeotto", R.drawable.pidgeotto))

        return pokemonList
    }
}