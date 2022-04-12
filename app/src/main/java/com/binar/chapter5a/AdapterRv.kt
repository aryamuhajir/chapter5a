package com.binar.chapter5a

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.chapter5a.Model.GetAllFilmResponseItem
import kotlinx.android.synthetic.main.item_adapter.view.*

class AdapterRv(private var datafilm : List<GetAllFilmResponseItem>) : RecyclerView.Adapter<AdapterRv.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRv.ViewHolder {
        val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: AdapterRv.ViewHolder, position: Int) {
        holder.itemView.txtJudul.text = datafilm[position].name
        holder.itemView.txtTanggal.text = datafilm[position].date
        holder.itemView.txtSutradara.text = datafilm[position].director
    }

    override fun getItemCount(): Int {
         return datafilm.size
    }
}