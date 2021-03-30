package space.basyk.beautysalon.screens.city

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentCityesBinding

class CityesFragment : BaseFragment() {

    private var binding: FragmentCityesBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCityesBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}