package space.basyk.beautysalon.database.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import space.basyk.beautysalon.database.room.entity.OrderItem

interface OrderDao {

    @Query("SELECT * FROM order_table")
    fun getAllOrders(): LiveData<List<OrderItem>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item:OrderItem)

    @Delete
    suspend fun delete(item:OrderItem)

    @Update
    suspend fun update(item:OrderItem)

}