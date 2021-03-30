package space.basyk.beautysalon.screens.reset

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.databinding.FragmentResetPasswordBinding


class ResetPasswordFragment : Fragment() {

    private var binding: FragmentResetPasswordBinding ?=null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResetPasswordBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}