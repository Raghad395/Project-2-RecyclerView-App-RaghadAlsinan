package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.ItemAdapter
import com.example.project_2_recyclerview_app.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data source
        val affirmationList = Datasource().loadAffirmations()

        // Connect the adapter with the data here
        val adapter = ItemAdapter(affirmationList, this)

        // Bind the recyclerview and the adapter here
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}