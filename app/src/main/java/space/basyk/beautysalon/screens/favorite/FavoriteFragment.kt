package space.basyk.beautysalon.screens.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.basyk.beautysalon.R
import space.basyk.beautysalon.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {

    private var binding: FragmentFavoriteBinding ?= null
    private val mBinding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoriteBinding.inflate(layoutInflater, container, false)
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

    }

}