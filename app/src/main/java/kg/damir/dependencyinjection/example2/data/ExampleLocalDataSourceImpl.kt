package kg.damir.dependencyinjection.example2.data

import kg.damir.dependencyinjection.example2.data.ExampleDatabase
import kg.damir.dependencyinjection.example2.data.ExampleLocalDataSource

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
