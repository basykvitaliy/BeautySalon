package space.basyk.beautysalon.database.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order_table")
data class OrderItem (
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    @ColumnInfo
    val title: String = "",
    @ColumnInfo
    val nameMaster: String = "",
    @ColumnInfo
    val service: String = "",
    @ColumnInfo
    val date: String = "",
    @ColumnInfo
    val time: Int = 0,
    @ColumnInfo
    val price: Int = 0
)