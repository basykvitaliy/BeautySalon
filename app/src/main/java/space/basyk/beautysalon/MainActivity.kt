package space.basyk.beautysalon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import space.basyk.beautysalon.R
import space.basyk.beautysalon.cicerone.Screens
class MainActivity : AppCompatActivity() {

    private val cicerone = Cicerone.create()
    val router: Router by lazy { cicerone.router }
    val navigatorHolder get() = cicerone.getNavigatorHolder()

    private val navigator = AppNavigator(this, R.id.main_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router.navigateTo(Screens.Splash())
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)}

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}