package TareaPoo

class Persona(val nombre: String, val edad: Int, val ciudad: String) {

    fun saludar() {
        println("Hola, me llamo $nombre y tengo $edad años.")
    }

    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }
}

fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")

    persona1.saludar()
    println("${persona1.nombre} es mayor de edad: ${persona1.esMayorDeEdad()}")

    persona2.saludar()
    println("${persona2.nombre} es mayor de edad: ${persona2.esMayorDeEdad()}")
}