package space.basyk.beautysalon.admin.mysale

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentSaleBinding


class SaleFragment : BaseFragment() {

    private var binding: FragmentSaleBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaleBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}