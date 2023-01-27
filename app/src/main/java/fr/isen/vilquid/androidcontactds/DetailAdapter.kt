package fr.isen.vilquid.androidcontactds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter(private val images: Array<String>): RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
		val view =
			LayoutInflater.from(parent.context).inflate(R.layout.activity_cell, parent, false)

		return DetailViewHolder(view)
	}

	override fun getItemCount(): Int {
		return images.size
	}

	override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
		val itemsViewModel = images[position]

		return holder.imageViewVP.setImageResource(itemsViewModel)
	}

	class DetailViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
		val imageViewVP: ImageView = itemView.findViewById(R.id.imageview)
	}
}

private fun ImageView.setImageResource(itemsViewModel: String) {

}
