package space.basyk.beautysalon.screens.editprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.R
import space.basyk.beautysalon.Utils.APP_ACTIVITY
import space.basyk.beautysalon.databinding.FragmentEditProfileBinding


class EditProfileFragment : Fragment() {

    private var binding: FragmentEditProfileBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditProfileBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        init()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    private fun init() {
        mBinding.btnSaveClient.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_editProfileFragment_to_ic_profile)
        }
    }

}