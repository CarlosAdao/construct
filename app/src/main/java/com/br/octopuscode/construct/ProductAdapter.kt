package com.br.octopuscode.construct

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.line_prod.view.*

class ProductAdapter(
    private val listProds: ArrayList<Prod>,
    private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.line_prod, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tag = position
        holder.itemView.setOnClickListener(clickListener)
        holder.tvNome.text = listProds[position].name
        holder.tvCat.text = listProds[position].cat
    }

    override fun getItemCount() = listProds.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNome = view.tvNomeProd!!
        val tvCat = view.tvCatProd!!
    }
}