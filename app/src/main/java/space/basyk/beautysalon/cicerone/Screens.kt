package space.basyk.beautysalon.cicerone

import com.github.terrakok.cicerone.androidx.FragmentScreen
import space.basyk.beautysalon.screens.calendar.CalendarFragment
import space.basyk.beautysalon.screens.choisemaster.ChoiseMasterFragment
import space.basyk.beautysalon.screens.city.CityesFragment
import space.basyk.beautysalon.screens.detailsalon.DetailSalonFragment
import space.basyk.beautysalon.screens.homepage.HomePageFragment
import space.basyk.beautysalon.screens.myorders.MyOrdersFragment
import space.basyk.beautysalon.screens.order.OrderFragment
import space.basyk.beautysalon.screens.profileclient.ProfileClientFragment
import space.basyk.beautysalon.screens.reset.ResetPasswordFragment
import space.basyk.beautysalon.screens.salon.SalonsFragment
import space.basyk.beautysalon.screens.second.SecondFragment
import space.basyk.beautysalon.screens.serviceview.ServiceFragment
import space.basyk.beautysalon.screens.signin.SignInFragment
import space.basyk.beautysalon.screens.splashscreen.SplashScreenFragment

object Screens{
    fun Splash() = FragmentScreen{ SplashScreenFragment() }  //сюда пишем все страницы
    fun Second() = FragmentScreen{ SecondFragment() }
    fun SignIn() = FragmentScreen{ SignInFragment() }
    fun Cities() = FragmentScreen{ CityesFragment() }
    fun Salons() = FragmentScreen{ SalonsFragment() }
    fun MyOrders() = FragmentScreen{ MyOrdersFragment() }
    fun Calendar() = FragmentScreen{ CalendarFragment() }
    fun ChoiseMaster() = FragmentScreen{ ChoiseMasterFragment() }
    fun DetailSalon() = FragmentScreen{ DetailSalonFragment() }
    fun Order() = FragmentScreen{ OrderFragment() }
    fun Service() = FragmentScreen{ ServiceFragment() }
    fun RestPass() = FragmentScreen{ ResetPasswordFragment() }
    fun HomePage() = FragmentScreen{ HomePageFragment() }
    fun ProfileClient() = FragmentScreen{ ProfileClientFragment() }

}
