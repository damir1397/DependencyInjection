package kg.damir.dependencyinjection.example1

class Activity {
    lateinit var computer: Computer

    init {
        Component().inject(this)
    }

}