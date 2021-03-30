package space.basyk.beautysalon.database.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import space.basyk.beautysalon.database.room.entity.ProfileItem

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: ProfileItem)

    @Update
    suspend fun update(item: ProfileItem)
}