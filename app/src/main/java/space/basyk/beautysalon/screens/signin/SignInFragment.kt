package space.basyk.beautysalon.screens.signin

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.fragment_sign_in.*
import space.basyk.beautysalon.BaseFragment
import space.basyk.beautysalon.databinding.FragmentSignInBinding
import org.koin.android.viewmodel.ext.android.viewModel
import space.basyk.beautysalon.R
import space.basyk.beautysalon.Utils.START_ACTIVITY

class SignInFragment : BaseFragment() {

    val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private var binding: FragmentSignInBinding ?= null
    private val mBinding get() = binding!!
    private val viewModel: SignInViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    @SuppressLint("ShowToast")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val inputEmail =tv_email.text.toString()
        val inputPassword =tv_password.text.toString()

        mBinding.btnSignIn.setOnClickListener {
            if (inputEmail.isNotEmpty() && inputPassword.isNotEmpty()) {
                auth.signInWithEmailAndPassword(inputEmail, inputPassword)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG", "createUserWithEmail:success")
                            Toast.makeText(context, "Authentication success.", Toast.LENGTH_SHORT)
                                .show()
                            val user = auth.currentUser
                            updateUI(user)

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG", "createUserWithEmail:failure", task.exception)
                            Toast.makeText(context, "Authentication failed.", Toast.LENGTH_SHORT)
                                .show()
                            updateUI(null)
                        }
                    }
            }else{
                Toast.makeText(context, "ERRROR!!!", Toast.LENGTH_SHORT).show()
            }
            START_ACTIVITY.navController.navigate(R.id.action_signInFragment_to_mainActivity)
        }
    }

    fun updateUI(currentUser: FirebaseUser?){

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

