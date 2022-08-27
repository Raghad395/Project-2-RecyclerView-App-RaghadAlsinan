package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Affirmation

//hide away this data preparation in a separate Datasource class that prepares the data for the app.
class Datasource {

    // list of items
    fun loadAffirmations() : List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }


    }


