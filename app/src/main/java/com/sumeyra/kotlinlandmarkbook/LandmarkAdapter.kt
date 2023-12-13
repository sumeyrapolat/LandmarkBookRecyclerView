package com.sumeyra.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sumeyra.kotlinlandmarkbook.databinding.RecyclerRowBinding

class LandmarkAdapter(val landamarkList : ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        //viewbinding kullanarak xml ile kodu bağlıcaz yani recycler_row ile kodu bağlıcaz
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return LandmarkHolder(binding)


    }

    override fun getItemCount(): Int {
        //rowdan kaç tane oluşturacağız
       return landamarkList.size

    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        // recycler_row bağlandıktan sonra ne olacak
        //hangi texte hangi veri kullanılacak
        holder.binding.recyclerViewTextView.text= landamarkList.get(position).name

        //tıklanınca ne olacak
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landamarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }


}