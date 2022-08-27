package com.example.project_2_recyclerview_app.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Affirmation

// TODO(1) Build class RecyclerView, Adapter, ViewHolder
// - Bind data with views
// - send list of data to RecyclerView

@Suppress("UNREACHABLE_CODE")
class ItemAdapter(
    private val dataset: List<Affirmation>,
    private val context: Context ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() { // this parameter define all needed info and position of the data

    // TODO[4] Create ViewHolder Class
    // Adapter helper class to arrange data in layout file
    //RecyclerView doesn't interact directly with item views, but deals with ViewHolders instead.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){ //Make ItemViewHolder a subclass of RecyclerView.ViewHolder and pass the view parameter into the superclass constructor.

        val textView : TextView = view.findViewById(R.id.item_title)

    }// End ViewHolder class


    //--------------- We have 3 basic functions : To Do ----------------------


    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("create a new view")
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("save the position of them (which item i'm dealing with")
        val item: Affirmation = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)

    }
    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size

}// End PizzaAdapter class

