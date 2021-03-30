package space.basyk.beautysalon.screens.choisemaster

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentChoiseMasterBinding


class ChoiseMasterFragment : BaseFragment() {

    private var binding: FragmentChoiseMasterBinding ?= null
    private val mBinding get() = binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChoiseMasterBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}