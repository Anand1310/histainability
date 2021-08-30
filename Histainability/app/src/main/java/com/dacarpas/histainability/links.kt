package com.dacarpas.histainability

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view.view.*


data class Link(var title: String, var link: String, var description: String)

object Links {

    val links = listOf<Link>(
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it")
    )
}

class LinksAdapter (val context: Context, val links: List<Link>) : RecyclerView.Adapter<LinksAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentLink: String = ""
        var currentPosition: Int = 0

        init {
            itemView.imgShare.setOnClickListener {
                if (!currentLink.startsWith("http://") && !currentLink.startsWith("https://"))
                    currentLink = "http://$currentLink";
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(currentLink))
                context.startActivity(browserIntent)
            }
        }

        fun setData(link: Link?, pos: Int){
            itemView.txvTitle.text = link!!.title
//            itemView.txvLink.text = link!!.link
            itemView.txvDescription.text = link!!.description
            this.currentLink = link!!.link
            this.currentPosition = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinksAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: LinksAdapter.MyViewHolder, position: Int) {
        val link = links[position]
        holder.setData(link, position)
    }

    override fun getItemCount(): Int {
        return links.size
    }
}