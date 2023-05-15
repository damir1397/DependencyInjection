package kg.damir.dependencyinjection.example1

import javax.inject.Inject

class Computer (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)
