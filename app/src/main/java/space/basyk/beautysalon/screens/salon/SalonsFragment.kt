package space.basyk.beautysalon.screens.salon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentSalonsBinding


class SalonsFragment : BaseFragment() {

    private var binding: FragmentSalonsBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSalonsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}