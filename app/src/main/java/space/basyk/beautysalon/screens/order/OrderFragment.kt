package space.basyk.beautysalon.screens.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentOrderBinding

class OrderFragment : BaseFragment() {

    private var binding: FragmentOrderBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}