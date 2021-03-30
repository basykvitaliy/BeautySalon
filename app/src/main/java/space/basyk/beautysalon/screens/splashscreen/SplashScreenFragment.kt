package space.basyk.beautysalon.screens.splashscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.Utils.START_ACTIVITY
import space.basyk.beautysalon.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : BaseFragment() {

    private var binding: FragmentSplashScreenBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashScreenBinding.inflate(layoutInflater, container, false)
        return mBinding.root

    }

    override fun onStart() {
        super.onStart()
        init()
    }

    private fun init() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            START_ACTIVITY.navController.navigate(R.id.action_splashScreenFragment_to_secondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}