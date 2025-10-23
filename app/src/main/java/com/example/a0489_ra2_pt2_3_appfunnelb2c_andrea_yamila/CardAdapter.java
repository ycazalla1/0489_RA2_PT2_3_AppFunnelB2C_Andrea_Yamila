package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    // Clase para los datos de cada tarjeta
    public static class CardData {
        public String titulo;
        public String descripcion;
        public String preu;


        public CardData(String titulo, String descripcion, String preu) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.preu = preu;
        }
    }

    private List<CardData> cards;

    public CardAdapter(List<CardData> cards) {
        this.cards = cards;
    }

    // ViewHolder
    public static class CardViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView descripcion;
        TextView preu;
        TextView iva;
        Button button;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.descripcion);
            preu = itemView.findViewById(R.id.preu);
        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardData card = cards.get(position);
        holder.titulo.setText(card.titulo);
        holder.descripcion.setText(card.descripcion);
        holder.preu.setText(card.preu);
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
