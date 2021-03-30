package space.basyk.beautysalon.screens.descriptionaction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentDescriptionSaleBinding


class DescriptionActionFragment : BaseFragment() {

    private var binding: FragmentDescriptionSaleBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionSaleBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}