package cmr.mesmenj.soinsdebeautquotidienne

import cmr.mesmenj.soinsdebeautquotidienne.ImageRepository.singleton.databaseRef
import cmr.mesmenj.soinsdebeautquotidienne.ImageRepository.singleton.imageList
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ImageRepository {
    object singleton {

        // se connecter à la reference images
        val databaseRef= FirebaseDatabase.getInstance().getReference("images")
        // creer une liste qui va contenir nos images
        val imageList= arrayListOf<ImageModel>()
    }
    fun updateData(callback:()->Unit){
        databaseRef.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                imageList.clear()

                for(ds in snapshot.children){
                    val image=ds.getValue(ImageModel::class.java)
                    if (image!=null){
                        imageList.add(image)
                    }
                }
                callback()

            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
}}