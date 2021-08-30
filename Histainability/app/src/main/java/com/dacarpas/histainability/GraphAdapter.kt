package com.dacarpas.histainability

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.graph_card_data.view.*

class GraphAdapter(val context : Context, private val eventsList : List<EventData>) : RecyclerView.Adapter<GraphAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var likeCount = 0
        init{
            itemView.setOnClickListener{
                likeCount++
                Toast.makeText(context, "\uD83D\uDC9C x $likeCount ", Toast.LENGTH_SHORT).show()
            }

        }

        fun setData(event: EventData?, position: Int) {
            itemView.txvEventTitle.text = event!!.title
            itemView.txvEventDescription.text = event.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // converts XML blueprints of a single card into view object
        val view = LayoutInflater.from(context).inflate(R.layout.graph_card_data, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val event = eventsList[position]
        holder.setData(event, position)

//        if(position == 0){
//            holder.itemView.tvTitleEvent.setTextColor(10)
//        }else{
//
//        }

    }

    override fun getItemCount() = eventsList.size
}