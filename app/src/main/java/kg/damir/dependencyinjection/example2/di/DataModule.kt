package kg.damir.dependencyinjection.example2.di

import android.content.Context
import dagger.Module
import dagger.Provides
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
class DataModule(
    private val context: Context
) {

    @Provides
    fun provideContext(): Context {
        return context
    }
  @Provides
    fun provideExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }

    @Provides
    fun provideExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }
}