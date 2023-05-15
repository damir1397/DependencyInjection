package kg.damir.dependencyinjection.example2.di

import dagger.Component
import kg.damir.dependencyinjection.example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}