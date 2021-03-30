package space.basyk.beautysalon

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import space.basyk.beautysalon.di.koinModule
import space.basyk.beautysalon.services.ApiServices

class App:Application() {


    lateinit var retrofit: Retrofit
    val BASE_URL: String = ""

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@App)
            modules(koinModule)
        }

    }

    companion object {
        internal lateinit var INSTANCE: App
            private set
    }


    fun getServise(): ApiServices? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit.create(ApiServices::class.java)
    }


}