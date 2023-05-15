package kg.damir.dependencyinjection.example2.di

import dagger.Binds
import dagger.Module
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
}