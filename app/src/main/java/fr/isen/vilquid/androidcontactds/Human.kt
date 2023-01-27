package fr.isen.vilquid.androidcontactds

import android.util.Log

class Human(var name: String, var surname: String, var email: String, var address: String, var picture: String) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as Human

		if (name != other.name) return false
		if (surname != other.surname) return false
		if (address != other.address) return false
		if (picture != other.picture) return false
		if (email != other.email) return false

		return true
	}

	operator fun get(position: Int): Any {
		return when (position) {
			0 -> name
			1 -> surname
			2 -> email
			3 -> address
			4 -> picture
			else -> Log.e("Human", "Invalid position")
		}
	}

}
