package space.basyk.beautysalon.screens.serviceview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentServiceBinding

class ServiceFragment : BaseFragment() {

    private var binding: FragmentServiceBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServiceBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}