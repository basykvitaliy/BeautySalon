package space.basyk.beautysalon.admin.admin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentAdminBinding


class AdminFragment : BaseFragment() {

    private var binding: FragmentAdminBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdminBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}