package space.basyk.beautysalon.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import space.basyk.beautysalon.room.entity.ProfileItem

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: ProfileItem)

    @Update
    suspend fun update(item: ProfileItem)
}