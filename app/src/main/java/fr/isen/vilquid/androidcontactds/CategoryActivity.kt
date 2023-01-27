package fr.isen.vilquid.androidcontactds


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import org.json.JSONException
import org.json.JSONObject

class CategoryActivity {
	private var url="https://randomuser.me/api/?results=10&nat=fr"
	private lateinit var adapter: CategoryAdapter
	private lateinit var binding: ActivityCategoryBinding

	fun onCreate(savedInstanceState: Bundle?) {
		val layoutInflater = LayoutInflater.from(this.adapter.context)
		binding = ActivityCategoryBinding.inflate(layoutInflater)
		addData()
	}

	private fun addData() {
		val queue = Volley.newRequestQueue(this.adapter.context)
		val jsonObjectID = JSONObject()
		val gson = Gson()

		try {
			jsonObjectID.put("",1)

		} catch (e: JSONException) {
			Log.e("ERROR", e.toString())
		}

		val req = JsonObjectRequest(Request.Method.GET, url, jsonObjectID, {
				response ->
			val dataFromJSON: Data = gson.fromJson(response.toString(),Data::class.java)
			var binding: ActivityCategoryBinding
			val layoutInflater = LayoutInflater.from(this.adapter.context)
			binding = ActivityCategoryBinding.inflate(layoutInflater)
			val catlist = dataFromJSON.data.firstOrNull()
			val adapter = binding.Title as CategoryAdapter
			adapter.updateData(catlist)
		}, {
				errorData -> Log.e("Erreur de l'API", errorData.toString())
		})

		queue.add(req)
	}
}