package fr.isen.vilquid.androidcontactds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val llm = LinearLayoutManager(this)
		llm.setOrientation(LinearLayoutManager.VERTICAL)
		val list = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.fragment_main_recycler_view)
		list.setLayoutManager(llm)
		val adapter = ContactAdapter()
	}
}