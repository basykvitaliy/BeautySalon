package space.basyk.beautysalon

import android.app.Activity
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Router
import space.basyk.beautysalon.client.MainActivity

abstract class BaseFragment : Fragment {
    constructor():super()
    constructor(contentLayoutId: Int):super(contentLayoutId)

    val router: Router by lazy { (activity as MainActivity).router }
}