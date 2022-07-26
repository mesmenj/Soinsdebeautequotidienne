package cmr.mesmenj.soinsdebeautquotidienne.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.soinsdebeautquotidienne.HomeFragment
import cmr.mesmenj.soinsdebeautquotidienne.R

class IngredientAdaptater(
    val layoutId:Int): RecyclerView.Adapter<IngredientAdaptater.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val ingredientImage= view.findViewById<RelativeLayout>(R.id.popup_ingrdient)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view= LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ingredientImage.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_popup1Fragment2_to_popup2)
        )
    }

    override fun getItemCount(): Int=8
}
