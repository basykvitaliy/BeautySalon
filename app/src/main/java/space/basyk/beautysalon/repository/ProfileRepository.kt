package space.basyk.beautysalon.repository

import space.basyk.beautysalon.database.room.ProfileDatabase
import space.basyk.beautysalon.database.room.entity.ProfileItem

class ProfileRepository(private val db: ProfileDatabase) {
    suspend fun insert(item: ProfileItem) = db.getProfileDao().insert(item)
    suspend fun update(item: ProfileItem) = db.getProfileDao().update(item)

    fun connectToDatabase(onSuccess: () -> Unit, onFail:(String) -> Unit){}
    fun signOut(){}
}