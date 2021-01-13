package space.basyk.beautysalon.screens.salon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentSalonsBinding


class SalonsFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val building: FragmentSalonsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_salons, container, false)
        return building.root
    }


}