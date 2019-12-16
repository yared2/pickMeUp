package com.example.pickmeup

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.sun.xml.internal.bind.v2.model.core.ID
import java.util.Arrays.asList
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import java.util.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ActivityCompat
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
import com.google.android.libraries.places.api.net.PlacesClient
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import kotlinx.android.synthetic.main.activity_auto_complete.*
import java.lang.StringBuilder
import java.util.jar.Manifest


class AutoComplete : AppCompatActivity() {

    lateinit var placesClient:PlacesClient
//    internal var placeId=""
    var placesFields=Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

//        requestPermission()
        initPlaces()
        setupPlacesAutocomplete()
        setupPlacesAutocomplete2()

//        editFrom.setOnFocusChangeListener { view, hasFocus ->
//            if (hasFocus)
//                setupPlacesAutocomplete()
//            else
//                Toast.makeText(this@AutoComplete,"focus lost",Toast.LENGTH_LONG).show()
//        }
//        setupCurrentPlace()
    }



    private fun setupPlacesAutocomplete() {
        val autocompleteFragment=supportFragmentManager.findFragmentById(R.id.fragment_place) as AutocompleteSupportFragment
        autocompleteFragment.setPlaceFields(placesFields)
        autocompleteFragment.setHint("From")

        autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
            override fun onPlaceSelected(p0: Place) {
                Toast.makeText(this@AutoComplete,""+p0.address,Toast.LENGTH_LONG).show()
            }

            override fun onError(p0: Status) {
                Toast.makeText(this@AutoComplete,""+p0.statusMessage,Toast.LENGTH_LONG).show()
            }

        })
    }
    private fun setupPlacesAutocomplete2() {
        val autocompleteFragment=supportFragmentManager.findFragmentById(R.id.fragment_place2) as AutocompleteSupportFragment
        autocompleteFragment.setPlaceFields(placesFields)
        autocompleteFragment.setHint("To")

        autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
            override fun onPlaceSelected(p0: Place) {
                Toast.makeText(this@AutoComplete,""+p0.address,Toast.LENGTH_LONG).show()
            }

            override fun onError(p0: Status) {
                Toast.makeText(this@AutoComplete,""+p0.statusMessage,Toast.LENGTH_LONG).show()
            }

        })
    }

    private fun initPlaces(){
        Places.initialize(this,getString(R.string.places_api))
        placesClient=Places.createClient(this)
    }
}
    
