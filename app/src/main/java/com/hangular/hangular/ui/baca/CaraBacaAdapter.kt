package com.hangular.hangular.ui.baca

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hangular.hangular.data.model.Baca
import com.hangular.hangular.databinding.TabelKonsonanBinding

class CaraBacaAdapter (val caraBaca : ArrayList<Baca>) : RecyclerView.Adapter<CaraBacaAdapter.ViewHolder>() {

    class ViewHolder (val binding : TabelKonsonanBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind (baca : Baca) {
            with(binding) {
                tabelNama.text = baca.nama
                tabelAwal.text = baca.awal
                tabelTengah.text = baca.tengah
                tabelAkhir.text = baca.akhir

                Glide.with(itemView.context)
                    .load(baca.gambar)
                    .into(tabelKonsonan)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TabelKonsonanBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(caraBaca[position])
    }

    override fun getItemCount(): Int = caraBaca.size
}