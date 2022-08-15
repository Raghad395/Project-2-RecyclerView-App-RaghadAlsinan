package com.example.project_2_recyclerview_app.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Survey

// - Bind data with views
// - send list of data to RecyclerView
class SurveyAdapter(
    private val dataset: List<Survey>,
    private val context: Context )

    : RecyclerView.Adapter<SurveyAdapter.SurveyViewHolder>() { // this step ques

    // Adapter helper class to arrange data in layout file
    class SurveyViewHolder(private val view: View) : RecyclerView.ViewHolder(view){

        val textView : TextView = view.findViewById(R.id.textView)
        val imageView : ImageView = view.findViewById(R.id.imageView) }

    // We have 3 basic functions : To Do

    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurveyViewHolder {
        TODO("create a new view")
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: SurveyViewHolder, position: Int) {
        TODO("save the position of them (which item i'm dealing with")
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.SurveyStringId)
        holder.imageView.setImageResource(item.ImageView)
    }
    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size
}

