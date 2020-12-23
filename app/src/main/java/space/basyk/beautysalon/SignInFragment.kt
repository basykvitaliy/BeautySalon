package space.basyk.beautysalon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_sign_in.*
import space.basyk.beautysalon.cicerone.Screens
import space.basyk.beautysalon.databinding.FragmentSignInBinding
import space.basyk.beautysalon.databinding.FragmentSplashScreenBinding


class SignInFragment : BaseFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSignInBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_in, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_forgot_pass.setOnClickListener {
            router.navigateTo(Screens.RestPass())
        }
        btn_Sign_In.setOnClickListener {
            router.navigateTo(Screens.Cities())
        }
    }


}