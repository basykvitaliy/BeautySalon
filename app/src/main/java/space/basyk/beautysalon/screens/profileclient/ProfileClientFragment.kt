package space.basyk.beautysalon.screens.profileclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentProfileClientBinding


class ProfileClientFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentProfileClientBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile_client, container, false)
        return binding.root
    }


}