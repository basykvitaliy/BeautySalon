package space.basyk.beautysalon.screens.splashscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_splash_screen.*
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.cicerone.Screens
import space.basyk.beautysalon.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSplashScreenBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_splash_screen, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        img_splash.setOnClickListener(View.OnClickListener {
            router.navigateTo(Screens.Second())
        })

    }

}