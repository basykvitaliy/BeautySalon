package space.basyk.beautysalon.screens.choisemaster

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentChoiseMasterBinding


class ChoiseMasterFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentChoiseMasterBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_choise_master, container, false)
        return binding.root
    }


}