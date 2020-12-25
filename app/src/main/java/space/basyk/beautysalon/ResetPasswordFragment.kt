package space.basyk.beautysalon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import space.basyk.beautysalon.databinding.FragmentResetPasswordBinding


class ResetPasswordFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentResetPasswordBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_reset_password, container, false)
        return binding.root
    }


}