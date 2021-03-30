package space.basyk.beautysalon.database.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import space.basyk.beautysalon.database.room.dao.ProfileDao
import space.basyk.beautysalon.database.room.entity.ProfileItem

@Database(entities = [ProfileItem::class], version = 1)
abstract class ProfileDatabase: RoomDatabase() {

    abstract fun getProfileDao(): ProfileDao

    companion object{
        @Volatile
        private var database: ProfileDatabase? = null

        @Synchronized
        fun getInstance(context: Context):ProfileDatabase{
            return if (database == null){
                database = Room.databaseBuilder(context, ProfileDatabase::class.java, "profile_database").build()
                database as ProfileDatabase
            }else{
                database as ProfileDatabase
            }
        }
    }

}