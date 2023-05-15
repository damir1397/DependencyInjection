package kg.damir.dependencyinjection.example2.di

import dagger.Module
import dagger.Provides
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import kg.damir.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import kg.damir.dependencyinjection.example2.domain.ExampleRepository


@Module
class DomainModule {

    @Provides
    fun provideExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}