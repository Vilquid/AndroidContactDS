package fr.isen.vilquid.androidcontactds

data class Data(var data: Array<Human>): java.io.Serializable {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as Data

		if (!data.contentEquals(other.data)) return false

		return true
	}

	override fun hashCode(): Int {
		return data.contentHashCode()
	}
}