package kg.damir.dependencyinjection.example2.di

import dagger.BindsInstance
import dagger.Subcomponent
import kg.damir.dependencyinjection.example2.presentation.MainActivity
import kg.damir.dependencyinjection.example2.presentation.MainActivity2

@Subcomponent(
    modules =[ViewModelModule::class]
)
interface ActivityComponent {
    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory{


        fun create(
            @BindsInstance id:String
        ):ActivityComponent
    }
}