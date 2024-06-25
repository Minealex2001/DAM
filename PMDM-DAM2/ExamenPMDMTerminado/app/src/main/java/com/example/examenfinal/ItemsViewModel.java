package com.example.examenfinal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.examenfinal.models.Item;
import com.example.examenfinal.models.ItemListDetails;
import com.example.examenfinal.pokeapi.PokeAPI;

import java.util.List;

public class ItemsViewModel extends AndroidViewModel {
    MutableLiveData<Item> selectedItemMutableLiveData = new MutableLiveData<>();
    MutableLiveData<List<ItemListDetails>> listElementosMutableLiveData = new MutableLiveData<>();
    ItemListDetails selected;

    public ItemsViewModel(@NonNull Application application) {
        super(application);
        PokeAPI.getItemList(listElementosMutableLiveData);
    }

    MutableLiveData<List<ItemListDetails>> getAll(){
        return listElementosMutableLiveData;
    }

    public void select(ItemListDetails itemListDetails) {
        selected = itemListDetails;
    }

    public MutableLiveData<Item> getSelected() {
        PokeAPI.getItem(selected.getName(), selectedItemMutableLiveData);
        return selectedItemMutableLiveData;
    }
}
