package fr.isen.vilquid.androidcontactds

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView


class CategoryAdapter {
	val context: Context?
		get() {
			return context
		}

	fun updateData(list: Human?) {
		if (list != null) {
			var catlist_2 = list
		}
	}

	fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)

		return CategoryViewHolder(view)
	}

	fun onBindViewHolder(holder: CategoryViewHolder, position: Int, catlist: Human) {
		val currentItem = catlist[position]

		holder.textView.text = currentItem.toString()
	}

	class CategoryViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
		val textView: TextView = itemView.findViewById(R.id.textView)
		val cardLinear: ConstraintLayout = itemView.findViewById(R.id.CardLinear)
		val email: TextView = itemView.findViewById(R.id.email)
		val imageView: ImageView = itemView.findViewById(R.id.imageview)
	}
}
