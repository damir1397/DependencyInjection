package kg.damir.dependencyinjection.example2.data

import kg.damir.dependencyinjection.example2.data.ExampleLocalDataSource
import kg.damir.dependencyinjection.example2.data.ExampleRemoteDataSource
import kg.damir.dependencyinjection.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
