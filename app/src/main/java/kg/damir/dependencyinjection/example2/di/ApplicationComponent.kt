package kg.damir.dependencyinjection.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import kg.damir.dependencyinjection.example2.presentation.MainActivity

@Component(
    modules = [
        DataModule::class,
        DomainModule::class
    ]
)
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance system: Long
        ): ApplicationComponent
    }
}