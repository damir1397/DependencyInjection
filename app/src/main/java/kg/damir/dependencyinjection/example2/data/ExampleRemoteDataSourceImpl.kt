package kg.damir.dependencyinjection.example2.data

import kg.damir.dependencyinjection.example2.data.ExampleApiService
import kg.damir.dependencyinjection.example2.data.ExampleRemoteDataSource

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}
