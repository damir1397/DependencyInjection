package kg.damir.dependencyinjection.example2

import android.app.Application
import kg.damir.dependencyinjection.example2.di.DaggerApplicationComponent

class ExampleApp:Application() {
     val component by lazy {
        DaggerApplicationComponent.factory().create(this,System.currentTimeMillis())
    }

}