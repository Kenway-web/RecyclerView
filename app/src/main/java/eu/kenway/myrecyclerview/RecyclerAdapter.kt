package eu.kenway.broadcastreceiver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import eu.kenway.myrecyclerview.R

class RecyclerAdapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles= arrayOf("ARGENTINA","AUSTRALIA","BELGIUM","BRAZIL","DENMARK","FIJI","GERMANY","INDIA","KUWAIT","NEW ZEALAND")

    private val images= intArrayOf(R.drawable.ic_flag_of_argentina,R.drawable.ic_flag_of_australia,R.drawable.ic_flag_of_belgium,R.drawable.ic_flag_of_brazil,R.drawable.ic_flag_of_denmark,R.drawable.ic_flag_of_fiji,
        R.drawable.ic_flag_of_germany,R.drawable.ic_flag_of_india,R.drawable.ic_flag_of_kuwait,R.drawable.ic_flag_of_new_zealand)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {

        val v=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=titles[position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var itemImage:ImageView
        var itemTitle:TextView


        init {
            itemImage=itemView.findViewById(R.id.tvimage)
            itemTitle=itemView.findViewById(R.id.tv_item_name)



        }



    }

}