package space.basyk.beautysalon.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import space.basyk.beautysalon.screens.signin.SignInViewModel
import space.basyk.beautysalon.screens.splashscreen.SplashScreenViewModel

val useCaseModule = module {  }
val repositoryModule = module {  }
val viewModelModule = module {
    viewModel { SplashScreenViewModel() }
    viewModel { SignInViewModel() }
}

val koinModule = useCaseModule+repositoryModule+viewModelModule