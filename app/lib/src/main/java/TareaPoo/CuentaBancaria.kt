package TareaPoo

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0

    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Nuevo saldo: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (saldo >= cantidad) {
            saldo -= cantidad
            println("Retiro exitoso. Nuevo saldo: $saldo")
        } else {
            println("Error: saldo insuficiente.")
        }
    }

    fun mostrarSaldo() {
        println("Saldo actual de $titular: $saldo")
    }
}

fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)
    cuenta.mostrarSaldo()
}