package com.example.practica12_pokedex.main.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.practica12_pokedex.main.ui.models.Pokemon;
import com.example.practica12_pokedex.main.ui.models.PokemonSprite;
import com.example.practica12_pokedex.main.ui.pokeapi.PokeApiClient;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private final MutableLiveData<List<PokemonSprite>> listSpritesMutableLiveData = new MutableLiveData<>();
    private final MutableLiveData<Pokemon> pokemonSeleccionado = new MutableLiveData<>();
    private final MutableLiveData<PokemonSprite> spriteSeleccionado = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
        MutableLiveData<Integer> offset = new MutableLiveData<>(0);
        PokeApiClient.getPokemonList(offset.getValue(), listSpritesMutableLiveData);
    }

    public void seleccionar(PokemonSprite sprite) {
        PokeApiClient.getPokemonInfo(sprite.getName(), pokemonSeleccionado);
        spriteSeleccionado.setValue(sprite);
    }

    public MutableLiveData<Pokemon> getPokemonSeleccionado() {
        return pokemonSeleccionado;
    }

    public MutableLiveData<PokemonSprite> getSpriteSeleccionado() {
        return spriteSeleccionado;
    }

    public MutableLiveData<List<PokemonSprite>> obtener() {
        return listSpritesMutableLiveData;
    }
}
