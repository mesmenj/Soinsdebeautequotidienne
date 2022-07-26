package cmr.mesmenj.soinsdebeautquotidienne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import cmr.mesmenj.soinsdebeautquotidienne.adapter.ImageAdapter
import com.google.firebase.database.DatabaseReference

class MainActivity : AppCompatActivity() {
        lateinit var database: DatabaseReference
        private lateinit var imageList: ArrayList<ImageModel>
        private lateinit var adapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main,)
        imageList = ArrayList()



        // charger notre Image Repository
        val repo= ImageRepository()
        //mettre à jour la liste d'image
        repo.updateData{
            fun onSupportNavigateUp(): Boolean {
                val navController= findNavController(R.id.fragmentContainerView2)
                return navController.navigateUp()|| super.onSupportNavigateUp()
            }
        }


    }


}