package space.basyk.beautysalon.screens.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.Utils.START_ACTIVITY
import space.basyk.beautysalon.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment() {

    private var binding: FragmentSecondBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        init()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    private fun init() {
        mBinding.btnClient.setOnClickListener {
            START_ACTIVITY.navController.navigate(R.id.action_secondFragment_to_signInFragment)
        }
    }


}