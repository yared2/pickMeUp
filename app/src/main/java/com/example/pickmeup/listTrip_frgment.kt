package com.example.pickmeup


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list_trip_frgment.*

/**
 * A simple [Fragment] subclass.
 */
class listTrip_frgment : Fragment() {
    val listrtip = ArrayList<Trip>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_trip_frgment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        listrtip.add(Trip("california","georgia"))
        listrtip.add(Trip("Washington","ohaio"))
        listrtip.add(Trip("iwoa","miami"))
        listrtip.add(Trip("california","georgia"))
        listrtip.add(Trip("Washington","ohaio"))
        listrtip.add(Trip("iwoa","miami"))
        listrtip.add(Trip("california","georgia"))
        listrtip.add(Trip("Washington","ohaio"))
        listrtip.add(Trip("iwoa","miami"))
        listrtip.add(Trip("california","georgia"))
        listrtip.add(Trip("Washington","ohaio"))
        listrtip.add(Trip("iwoa","miami"))

        val   adaptet =adapter(listrtip)
        rv?.layoutManager =  LinearLayoutManager(context)
        rv.adapter=adaptet
    }

}
