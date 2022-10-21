package com.example.exercicioclasses

fun main() {
    var vehicle = Vehicle("Fiesta")
    vehicle.print()
    vehicle.acelerador()
    vehicle.print()
    vehicle.acelerador()
    vehicle.print()
    vehicle.brake()
    vehicle.print()

}

class Vehicle(model: String) {
    var model: String
    var velocity: Long
    var aceleration: Long

    init {
        this.model = model
        this.velocity= 0
        this.aceleration= 10
    }

    fun acelerador() {
        velocity = velocity + aceleration
    }
    fun brake(): Long {
        velocity = velocity - aceleration
        if (velocity < 0)
            velocity = 0
        return velocity
    }
    fun print() {
        println("Velocidade do veiculo $model: $velocity")
    }

}