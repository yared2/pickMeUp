package com.example.pickmeup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter (val tipslist:ArrayList<Trip>) : RecyclerView.Adapter<adapter.MyViewHolder>() {
    //    var listrtip = ArrayList<Trip>(arrayListOf(Trip("califpr", "georgia"), Trip("fiarField", "iowa")))

   override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.bName?.text = tipslist[position].from
        holder?.bAuthor.text = tipslist[position].to
    }
    /**
     * Returns the size of the container that holds the data.
     * @return Size of the list of data.
     */
   override fun getItemCount(): Int {
        return tipslist.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bName = itemView.findViewById<TextView>(R.id.from)
        val bAuthor = itemView.findViewById<TextView>(R.id.to)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.trip_layout, parent, false)
        return MyViewHolder(v);
    }


}
