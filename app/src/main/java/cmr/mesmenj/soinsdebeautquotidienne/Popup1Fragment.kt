package cmr.mesmenj.soinsdebeautquotidienne

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.soinsdebeautquotidienne.adapter.IngredientAdaptater


class Popup1Fragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view=inflater.inflate(R.layout.fragment_popup1, container, false)
        val imageVii= view.findViewById<RecyclerView>(R.id.chevre)
        imageVii.adapter=IngredientAdaptater(R.layout.item_popup)
        imageVii.layoutManager=LinearLayoutManager(context)


        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}