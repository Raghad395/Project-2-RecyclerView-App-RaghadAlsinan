package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Survey

class Datasource {

    // list of items
    fun loadSurvey() : List<Survey>{
        return listOf(
            Survey(R.string.Survey1, R.string.question_3, R.drawable.sv1),
            Survey(R.string.Survey2, R.string.question_5, R.drawable.sv2),
            Survey(R.string.Survey3, R.string.question_3, R.drawable.sv3)
        )
    }
    }

