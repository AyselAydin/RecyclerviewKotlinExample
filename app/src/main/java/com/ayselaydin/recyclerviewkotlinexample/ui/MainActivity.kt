package com.ayselaydin.recyclerviewkotlinexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayselaydin.recyclerviewkotlinexample.PokemonMockList
import com.ayselaydin.recyclerviewkotlinexample.R
import com.ayselaydin.recyclerviewkotlinexample.adapter.PokemonAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_PokemonList.adapter = PokemonAdapter(PokemonMockList.getPokemonList())
        rv_PokemonList.layoutManager = GridLayoutManager(this, 2)
    }
}