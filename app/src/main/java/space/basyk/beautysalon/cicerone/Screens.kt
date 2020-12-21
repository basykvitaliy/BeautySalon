package space.basyk.beautysalon.cicerone

import com.github.terrakok.cicerone.androidx.AppScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import space.basyk.beautysalon.SecondFragment
import space.basyk.beautysalon.SignInFragment
import space.basyk.beautysalon.SplashScreenFragment
import space.basyk.beautysalon.client.*

object Screens{
    fun Splash() = FragmentScreen{SplashScreenFragment()}  //сюда пишем все страницы
    fun Second() = FragmentScreen{SecondFragment()}
    fun SignIn() = FragmentScreen{SignInFragment()}
    fun Cities() = FragmentScreen{CityesFragment()}
    fun Salons() = FragmentScreen{SalonsFragment()}
    fun MyOrders() = FragmentScreen{MyOrdersFragment()}
    fun Calendar() = FragmentScreen{CalendarFragment()}
    fun ChoiseMaster() = FragmentScreen{ChoiseMasterFragment()}
    fun DetailSalon() = FragmentScreen{DetailSalonFragment()}
    fun Order() = FragmentScreen{OrderFragment()}
    fun Service() = FragmentScreen{ServiceFragment()}

}
