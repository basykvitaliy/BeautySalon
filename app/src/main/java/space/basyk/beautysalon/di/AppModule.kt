package space.basyk.beautysalon.di

import org.koin.dsl.module

val useCaseModule = module {  }
val repositoryModule = module {  }
val viewModelModule = module {  }

val koinModule = useCaseModule+repositoryModule+viewModelModule