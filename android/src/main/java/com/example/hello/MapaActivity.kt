package com.example.hello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mappedin.sdk.models.MPIHeader
import com.mappedin.sdk.web.MPIOptions
import kotlinx.android.synthetic.main.activity_mapa.*

class MapaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa)


        // use loadVenue to load venue
        mapView.loadVenue(
                MPIOptions.Init("5eab30aa91b055001a68e996", "RJyRXKcryCMy4erZqqCbuB1NbR66QTGNXVE0x3Pg6oCIlUR1",
                        "mappedin-demo-mall",
                        headers = listOf(MPIHeader("testName", "testValue"))),
                MPIOptions.ShowVenue(labelAllLocationsOnInit = true, backgroundColor = "#CDCDCD")
        )
    }
}