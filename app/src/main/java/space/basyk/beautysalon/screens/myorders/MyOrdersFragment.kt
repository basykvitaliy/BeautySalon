package space.basyk.beautysalon.screens.myorders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentMyOrdersBinding

class MyOrdersFragment : BaseFragment() {

    private var binding: FragmentMyOrdersBinding ?= null
    private val mBinding get() = binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyOrdersBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}