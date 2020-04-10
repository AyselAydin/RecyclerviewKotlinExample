package com.ayselaydin.recyclerviewkotlinexample.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayselaydin.recyclerviewkotlinexample.model.PokemonModel

class PokemonAdapter(val pokemonList: List<PokemonModel>) :
    RecyclerView.Adapter<PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(parent)
    }

    override fun getItemCount(): Int = pokemonList.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemonList[position])
    }
}