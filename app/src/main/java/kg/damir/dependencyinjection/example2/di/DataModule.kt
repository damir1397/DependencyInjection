package kg.damir.dependencyinjection.example2.di

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule{
    @ApplicationScope
    @Binds
    fun bindsExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    fun bindsExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
}