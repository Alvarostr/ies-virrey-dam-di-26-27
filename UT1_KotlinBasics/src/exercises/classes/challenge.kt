package exercises.classes

/*
 * CHALLENGE · GEOMETRIC SHAPES IN KOTLIN
 *
 * Migration of the UT0 project FigurasGeometricas (Java) to Kotlin.
 * Compare each part with the original Java file: the concepts are the same,
 * the amount of code is not.
 *
 * Own package (exercises.classes.shapes): these classes cannot clash with the
 * classes of the other exercises.
 */

// ---------------------------------------------------------------- Figura
// Java: abstract public class Figura { protected String nombre; public Figura(String nombre) {...} }
// Kotlin: the constructor and the property in one line (section 1).
// "protected": visible in the subclasses only. Careful: in Java it was also visible
// in the whole package; in Kotlin it is NOT (section 5).
abstract class Figura(protected val nombre: String) {

    // Abstract method: each shape decides HOW it calculates its area (section 7).
    abstract fun calcularArea(): Double

    // Normal method (final by default): written once, used by every subclass.
    // It calls calcularArea(), and each object runs its own version: polymorphism (section 9).
    fun mostrarInfo() {
        println("Mostrando información de la figura...")
        println("$this - Área: ${"%.2f".format(calcularArea())}")
    }

    // toString is overridden here and again in each subclass (section 4).
    // We do not need to write "open": an override is open by default (section 6),
    // so the subclasses can override it again.
    override fun toString(): String = "Figura: $nombre"
}

// ---------------------------------------------------------------- Coloreable
// Interface with a single method: what some shapes CAN DO (section 8).
interface Coloreable {
    fun pintar(color: String)
}

// ---------------------------------------------------------------- Subclasses
// ": Figura(nombre)" replaces "extends Figura" + "super(nombre)".
// ", Coloreable" replaces "implements Coloreable" (no parentheses: no constructor).
// radio is private val: it was "private double radio" in Java, without getter.
class Circulo(nombre: String, private val radio: Double) : Figura(nombre), Coloreable {

    override fun calcularArea(): Double {
        println("Calculando área de círculo: π × radio²")
        return Math.PI * radio * radio
    }

    override fun pintar(color: String) {
        // nombre is protected in Figura: Circulo is a subclass, so it can use it.
        println("$nombre (Círculo) pintado de color $color")
    }

    // super.toString() reuses the text of Figura, as in the Java version (section 6.1).
    override fun toString(): String = "${super.toString()} [Círculo, radio=$radio]"
}

class Rectangulo(nombre: String, private val base: Double, private val altura: Double) :
    Figura(nombre), Coloreable {

    override fun calcularArea(): Double {
        println("Calculando área de rectángulo: base × altura")
        return base * altura
    }

    override fun pintar(color: String) {
        println("$nombre (Rectángulo) pintado de color $color")
    }

    override fun toString(): String = "${super.toString()} [Rectángulo, base=$base, altura=$altura]"
}

// Triangulo is a Figura but NOT Coloreable.
class Triangulo(nombre: String, private val base: Double, private val altura: Double) : Figura(nombre) {

    override fun calcularArea(): Double {
        println("Calculando área de triángulo: (base × altura) / 2")
        return base * altura / 2
    }

    override fun toString(): String = "${super.toString()} [Triángulo, base=$base, altura=$altura]"
}

// ---------------------------------------------------------------- GestorFiguras
// Java: a class with static methods. Kotlin: an object (section 12).
// It is used exactly like in Java: GestorFiguras.buscarPrimeraColoreable(...)
object GestorFiguras {

    // The parameter is Coloreable, never Circulo or Rectangulo (same idea as in Java).
    fun pintarSiEsPosible(figura: Coloreable, color: String) {
        println("Intentando pintar una figura coloreable...")
        figura.pintar(color)
    }

    // Returns Coloreable? : the "?" says in the TYPE that there may be no result (Block 4).
    // In Java the method returned null without any warning in its signature.
    fun buscarPrimeraColoreable(figuras: List<Figura>): Coloreable? {
        println("Buscando la primera figura coloreable de la lista...")

        // filterIsInstance<Coloreable>() keeps only the shapes that are Coloreable and
        // returns a List<Coloreable>: no instanceof, no cast (section 9).
        // firstOrNull() returns the first one, or null if the list is empty.
        val encontrada = figuras.filterIsInstance<Coloreable>().firstOrNull()

        // A message for each case, as in the Java version.
        if (encontrada != null) {
            println("Encontrada: $encontrada")
        } else {
            println("Ninguna figura de la lista es coloreable")
        }
        return encontrada
    }
}

// ---------------------------------------------------------------- main
fun main() {
    // --- Case 1: list with some coloreable shapes ---
    println("=== CASO 1: lista con figuras coloreables ===")
    // A List<Figura> instead of an array of 4 positions filled one by one.
    val figuras = listOf(
        Triangulo("Triángulo 1", 3.0, 8.0),       // not coloreable
        Triangulo("Triángulo 2", 5.0, 4.0),       // not coloreable
        Circulo("Círculo 1", 5.0),                // coloreable
        Rectangulo("Rectángulo 1", 4.0, 6.0)      // coloreable
    )

    // Block 4: ?.let runs only if there is a result; ?: handles the null case.
    GestorFiguras.buscarPrimeraColoreable(figuras)
        ?.let { GestorFiguras.pintarSiEsPosible(it, "Verde") }
        ?: println("No hay ninguna figura que pintar")

    // --- Case 2: list WITHOUT coloreable shapes ---
    println("\n=== CASO 2: lista sin figuras coloreables ===")
    val soloTriangulos = listOf(
        Triangulo("Triángulo A", 2.0, 3.0),
        Triangulo("Triángulo B", 6.0, 2.0),
        Triangulo("Triángulo C", 4.0, 4.0)
    )

    // Same logic with if + smart cast, the other option of Block 4.
    val resultado = GestorFiguras.buscarPrimeraColoreable(soloTriangulos)
    if (resultado != null) {
        GestorFiguras.pintarSiEsPosible(resultado, "Rojo")
    } else {
        println("No hay ninguna figura que pintar")
    }

    // --- Extra: polymorphism with mostrarInfo() ---
    println("\n=== EXTRA: información de todas las figuras ===")
    // Each shape runs its own calcularArea() inside the same mostrarInfo().
    (figuras + soloTriangulos).forEach { it.mostrarInfo() }
}

/*
 * COMPARISON (number of lines)
 *  Without comments or blank lines:
 *   - Java version: 7 files (Figura, Circulo, Rectangulo, Triangulo, Coloreable,
 *     GestorFiguras, Main), about 130 lines of code.
 *   - Kotlin version: 1 file, about 80 lines of code, and it also does the "extra" part.
 *
 *  What made the biggest difference?
 *   - Primary constructors: no attributes + constructor + this.x = x.
 *   - String templates instead of "..." + x + "...".
 *   - object instead of a class with static methods.
 *   - listOf + filterIsInstance instead of arrays, for loops, instanceof and casts.
 *   - Coloreable? in the type: the possible null is visible and the compiler checks it.
 */