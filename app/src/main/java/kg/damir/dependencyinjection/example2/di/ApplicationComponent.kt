package kg.damir.dependencyinjection.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import kg.damir.dependencyinjection.example2.presentation.MainActivity

@Component(modules = [
    DataModule::class,
    DomainModule::class
])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder{

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder
        @BindsInstance
        fun time(system: Long): ApplicationComponentBuilder
        fun build():ApplicationComponent
    }
}