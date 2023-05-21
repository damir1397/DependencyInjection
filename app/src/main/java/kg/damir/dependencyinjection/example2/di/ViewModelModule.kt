package kg.damir.dependencyinjection.example2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import kg.damir.dependencyinjection.example2.presentation.ExampleViewModel
import kg.damir.dependencyinjection.example2.presentation.ExampleViewModel2

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @StringKey("ExampleViewModel")
    fun bindExampleViewModel(impl:ExampleViewModel):ViewModel

    @Binds
    @IntoMap
    @StringKey("ExampleViewModel2")
    fun bindExampleViewModel2(impl: ExampleViewModel2):ViewModel
}