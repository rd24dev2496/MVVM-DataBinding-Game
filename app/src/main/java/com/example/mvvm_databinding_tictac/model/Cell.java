package com.example.mvvm_databinding_tictac.model;


import com.example.mvvm_databinding_tictac.utilities.StringUtility;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
