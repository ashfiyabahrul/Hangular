package com.hangular.hangular.ui.hangul

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hangular.hangular.data.model.Hangul
import com.hangular.hangular.databinding.GridHangulBinding
import com.hangular.hangular.ui.detail.DetailActivity

class VocalRecycleAdapter (val vocalHangul : ArrayList<Hangul>) : RecyclerView.Adapter<VocalRecycleAdapter.ViewHolder>() {

    inner class ViewHolder (private val binding: GridHangulBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (hangul : Hangul) {
            with(binding) {
                tvName.text = hangul.nama
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context,DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_HANGUL,hangul.id)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(hangul.gambar)
                    .into(imgHangul)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GridHangulBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hangul = vocalHangul[position]
        holder.bind(hangul)
    }

    override fun getItemCount(): Int = vocalHangul.size

}