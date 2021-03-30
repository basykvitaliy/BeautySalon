package space.basyk.beautysalon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import space.basyk.beautysalon.Utils.START_ACTIVITY
import space.basyk.beautysalon.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private var binding: ActivitySplashScreenBinding ?= null
    private val mBinding get() = binding!!
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        START_ACTIVITY = this
        navController = Navigation.findNavController(this, R.id.start_host_fragment)

    }
}