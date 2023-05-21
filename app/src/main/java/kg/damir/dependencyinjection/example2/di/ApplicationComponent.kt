package kg.damir.dependencyinjection.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import kg.damir.dependencyinjection.example2.data.database.ExampleDatabase
import kg.damir.dependencyinjection.example2.data.network.ExampleApiService
import kg.damir.dependencyinjection.example2.presentation.ExampleViewModel
import kg.damir.dependencyinjection.example2.presentation.MainActivity
import kg.damir.dependencyinjection.example2.presentation.MainActivity2
import javax.inject.Singleton

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        DomainModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)
    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance system: Long
        ): ApplicationComponent
    }
}