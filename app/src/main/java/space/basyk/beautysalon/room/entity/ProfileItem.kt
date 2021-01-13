package space.basyk.beautysalon.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_client")
data class ProfileItem(
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null,

    @ColumnInfo(name = "name_client")
    val name:String,

    @ColumnInfo(name = "email_client")
    val email:String,

    @ColumnInfo(name = "phone_client")
    val phone:Int
    )