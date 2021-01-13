package space.basyk.beautysalon

import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Router

abstract class BaseFragment : Fragment {
    constructor():super()
    constructor(contentLayoutId: Int):super(contentLayoutId)

    val router: Router by lazy { (activity as MainActivity).router }
}