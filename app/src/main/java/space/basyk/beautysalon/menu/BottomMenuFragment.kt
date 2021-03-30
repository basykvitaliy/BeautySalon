package space.basyk.beautysalon.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import kotlinx.android.synthetic.main.fragment_bottom_menu.*
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R

class BottomMenuFragment : BaseFragment() {
    private lateinit var bottomNavigationBar: BottomNavigationBar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bottomNavigationBar = ab_bottom_navigation_bar as BottomNavigationBar

    }

}
