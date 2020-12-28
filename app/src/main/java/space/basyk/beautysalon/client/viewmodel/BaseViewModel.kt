package space.basyk.beautysalon.client.viewmodel

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router

class BaseViewModel(val router: Router): ViewModel() {
    val router1 = this.router
}