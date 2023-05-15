package kg.damir.dependencyinjection.example2.data.repository

import kg.damir.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import kg.damir.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import kg.damir.dependencyinjection.example2.data.mapper.ExampleMapper
import kg.damir.dependencyinjection.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
        mapper.map()
    }
}
