package com.ayselaydin.recyclerviewkotlinexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayselaydin.recyclerviewkotlinexample.R
import com.ayselaydin.recyclerviewkotlinexample.model.PokemonModel

class PokemonViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.item_layout_pokemon, container, false)
) {
    val imgPokemonPhoto: ImageView = itemView.findViewById(R.id.img_pokemon)
    val tvPokemonName: TextView = itemView.findViewById(R.id.tv_pokemonName)

    fun bind(pokemonModel: PokemonModel) {
        imgPokemonPhoto.setImageResource(pokemonModel.pokemonPhoto)
        tvPokemonName.text = pokemonModel.pokemonName
    }
}