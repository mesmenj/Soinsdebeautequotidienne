package cmr.mesmenj.soinsdebeautquotidienne

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.soinsdebeautquotidienne.ImageRepository.singleton.imageList
import cmr.mesmenj.soinsdebeautquotidienne.adapter.ImageAdapter

class HomeFragment: Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerImage= view.findViewById<RecyclerView>(R.id.recycler)
        recyclerImage.adapter = ImageAdapter( requireContext(), imageList= imageList,R.layout.recycler_image)


        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        }




    }
