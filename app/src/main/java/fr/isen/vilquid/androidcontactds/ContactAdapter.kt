package fr.isen.vilquid.androidcontactds

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup

class ContactAdapter {
	val context: Context? = null
		get() {
			return field
		}

	fun updateData(list: Human?) {
		if (list != null) {
			var catlist_2 = list
		}
	}

	fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.CategoryViewHolder {
		// inflates the card_view_design view
		// that is used to hold list item
		val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)

		return CategoryAdapter.CategoryViewHolder(view)
	}

	fun onBindViewHolder(holder: CategoryAdapter.CategoryViewHolder, position: Int, catlist: Human) {
		val currentItem = catlist[position]

		holder.textView.text = currentItem.toString()
	}
}
