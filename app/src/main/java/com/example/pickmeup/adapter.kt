package com.example.pickmeup

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class adapter (var context:Context,val tipslist:ArrayList<Trip>) : RecyclerView.Adapter<adapter.MyViewHolder>() {
    //    var listrtip = ArrayList<Trip>(arrayListOf(Trip("califpr", "georgia"), Trip("fiarField", "iowa")))

   override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder?.bName?.text = tipslist[position].from
       holder?.bAuthor.text = tipslist[position].to
      holder.parentlayout.setOnClickListener {
           val intent = Intent(context, listTrip_frgment::class.java)
           var res = tipslist[position]
           Toast.makeText(context, " $res clicked", Toast.LENGTH_LONG).show()


       }
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
        var parentlayout : RelativeLayout = itemView.findViewById(R.id.parent) as RelativeLayout

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.trip_layout, parent, false)
        return MyViewHolder(v);
    }
//    override fun onBindViewHolder(holder: Holder?, position: Int) {
//        var item : MyObject = objects[position]
//
//        // Calling the clickListener sent by the constructor

//    }


}
