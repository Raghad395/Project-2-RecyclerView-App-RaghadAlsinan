package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.SurveyAdapter
import com.example.project_2_recyclerview_app.data.Datasource
import com.example.project_2_recyclerview_app.model.Survey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data source
        val surveyList = Datasource().loadSurvey()

        // Connect the adapter with the data here
        val adapter = SurveyAdapter(surveyList, this)
        // Bind the recyclerview and the adapter here
        val recyclerView : RecyclerView = findViewById(R.id.rv_survey)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}