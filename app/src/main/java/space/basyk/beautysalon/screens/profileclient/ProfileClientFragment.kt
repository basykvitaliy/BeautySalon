package space.basyk.beautysalon.screens.profileclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.Utils.APP_ACTIVITY
import space.basyk.beautysalon.databinding.FragmentProfileClientBinding

class ProfileClientFragment : BaseFragment() {

    private var binding:FragmentProfileClientBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileClientBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        init()
    }

    private fun init() {
        mBinding.btnEditClient.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_ic_profile_to_editProfileFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}