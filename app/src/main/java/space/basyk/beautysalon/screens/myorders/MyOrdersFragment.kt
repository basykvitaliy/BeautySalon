package space.basyk.beautysalon.screens.myorders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentMyOrdersBinding


class MyOrdersFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMyOrdersBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_my_orders, container, false)
        return binding.root
    }


}