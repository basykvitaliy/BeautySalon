package space.basyk.beautysalon.database.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import space.basyk.beautysalon.database.DatabaseRepository

class AppFirebaseRepository: DatabaseRepository {

    val AUTH: FirebaseAuth = FirebaseAuth.getInstance()
    lateinit var EMAIL: String
    lateinit var PASSWORD: String

    override fun connectToFirebase(onSuccess: () -> Unit, onFail: (String) -> Unit) {
        AUTH.signInWithEmailAndPassword(EMAIL, PASSWORD)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener {
                AUTH.createUserWithEmailAndPassword(EMAIL, PASSWORD)
                    .addOnSuccessListener {
                        onSuccess()
                    }
                    .addOnFailureListener {
                        onFail(it.message.toString())
                        Log.d("LOG", it.message.toString())
                    }
            }
    }

    override fun signOut() {
        AUTH.signOut()
    }
}