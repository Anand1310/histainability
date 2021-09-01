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

    val links = listOf(
        Link("Team 1", "www.google.com", "A tool to search everything"),
        Link("Team 2", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 3", "www.google.com", "A tool to search everything"),
        Link("Team 4", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 5", "www.google.com", "A tool to search everything"),
        Link("Team 6", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 7", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 8", "www.google.com", "A tool to search everything"),
        Link("Team 9", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 10", "www.google.com", "A tool to search everything"),
        Link("Team 11", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Team 12", "www.google.com", "A tool to search everything"),
        Link("Wikipedia", "www.wikipedia.com", "Anyone can learn anything from it"),
        Link("Google", "www.google.com", "A tool to search everything")
    )
}

class LinksAdapter (val context: Context, private val links: List<Link>) : RecyclerView.Adapter<LinksAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentLink: String = ""
        private var currentPosition: Int = 0

        init {
            itemView.imgShare.setOnClickListener {
                if (!currentLink.startsWith("http://") && !currentLink.startsWith("https://"))
                    currentLink = "http://$currentLink"
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(currentLink))
                context.startActivity(browserIntent)
            }
        }

        fun setData(link: Link?, pos: Int){
            itemView.txvTitle.text = link!!.title
//            itemView.txvLink.text = link!!.link
            itemView.txvDescription.text = link.description
            this.currentLink = link.link
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