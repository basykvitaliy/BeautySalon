package space.basyk.beautysalon.screens.detailsalon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentDetailSalonBinding


class DetailSalonFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDetailSalonBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_salon, container, false)
        return binding.root
    }

}