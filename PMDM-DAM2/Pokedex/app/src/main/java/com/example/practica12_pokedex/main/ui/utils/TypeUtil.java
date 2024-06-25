package com.example.practica12_pokedex.main.ui.utils;

import com.example.practica12_pokedex.R;

public class TypeUtil {
    public static int getTypeColor(String type) {
        return switch (type) {
            case "fighting" -> R.color.fighting;
            case "flying" -> R.color.flying;
            case "poison" -> R.color.poison;
            case "ground" -> R.color.ground;
            case "rock" -> R.color.rock;
            case "bug" -> R.color.bug;
            case "ghost" -> R.color.ghost;
            case "steel" -> R.color.steel;
            case "fire" -> R.color.fire;
            case "water" -> R.color.water;
            case "grass" -> R.color.grass;
            case "electric" -> R.color.electric;
            case "psychic" -> R.color.psychic;
            case "ice" -> R.color.ice;
            case "dragon" -> R.color.dragon;
            case "fairy" -> R.color.fairy;
            case "dark" -> R.color.dark;
            default -> R.color.gray_21;
        };
    }
}
