package space.basyk.beautysalon.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentAppBarBinding

class appBarFragment : BaseFragment() {

    private var binding: FragmentAppBarBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppBarBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }


}