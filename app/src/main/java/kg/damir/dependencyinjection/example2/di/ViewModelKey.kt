package kg.damir.dependencyinjection.example2.di

import dagger.MapKey
import kotlin.reflect.KClass
import androidx.lifecycle.ViewModel

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewModelKey (val value : KClass<out ViewModel>)