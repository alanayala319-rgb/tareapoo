package TareaPoo

abstract class Vehiculo(val marca: String, val velocidadMaxima: Int) {
    abstract fun tipoVehiculo(): String

    fun mostrarInfo() {
        println("${tipoVehiculo()}: $marca — Vel. máx: $velocidadMaxima km/h")
    }
}

class Auto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Auto"
}

class Moto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Moto"
}

class Camion(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Camion"
}

fun main() {
    val vehiculos: List<Vehiculo> = listOf(
        Auto("Toyota", 180),
        Moto("Honda", 220),
        Camion("Volvo", 120)
    )

    for (vehiculo in vehiculos) {
        vehiculo.mostrarInfo()
    }
}