package com.sumeyra.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sumeyra.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var landmarkList= ArrayList<Landmark>()

        var pisa= Landmark("Pisa","Italy",R.drawable.pisa)
        var colloseum = Landmark("Colloseum","Italy", R.drawable.colosseum)
        var eiffel = Landmark("Eiffel","France",R.drawable.eifell)
        var londonBridge= Landmark("London Bridge", "UK", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colloseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)


        binding.recyclerView.layoutManager= LinearLayoutManager(this@MainActivity)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter= landmarkAdapter

    }
}