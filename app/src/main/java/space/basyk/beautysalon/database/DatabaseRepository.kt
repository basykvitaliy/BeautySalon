package space.basyk.beautysalon.database

interface DatabaseRepository {
    fun signOut(){}
    fun connectToFirebase(onSuccess: () -> Unit, onFail: (String) -> Unit)
}