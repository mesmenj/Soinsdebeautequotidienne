package cmr.mesmenj.soinsdebeautquotidienne.adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.soinsdebeautquotidienne.HomeFragment
import cmr.mesmenj.soinsdebeautquotidienne.ImageModel
import cmr.mesmenj.soinsdebeautquotidienne.ImageRepository.singleton.imageList
import cmr.mesmenj.soinsdebeautquotidienne.MainActivity
import cmr.mesmenj.soinsdebeautquotidienne.R
import com.bumptech.glide.Glide

class ImageAdapter(
   private val context: Context,
    private val imageList: List<ImageModel>,
    private val layoutId: Int
):RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){


        val imageReal= view.findViewById<RelativeLayout>(R.id.relative_item)
        val imageList= view.findViewById<ImageView>(R.id.visage_lisse)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentImage= imageList[position]
        Glide.with(context).load(Uri.parse(currentImage.imageUrl)).into(holder.imageList)
        holder.imageReal.setOnClickListener(
            Navigation.createNavigateOnClickListener(
            R.id.action_homeFragment2_to_popup1Fragment2))







    }

    override fun getItemCount(): Int= imageList.size
}