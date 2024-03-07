import org.example.Fch
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Fch test
 *
 * @constructor Create empty Fch test
 */
class FchTest {

    /**
     * Set up
     *
     */
    @BeforeEach
    fun setUp() {
    }

    /**
     * Tear down
     *
     */
    @AfterEach
    fun tearDown() {
    }

    /**
     * Valida
     *
     */
    @Test
    fun valida() {
        val fecha = Fch(15, 13, 2023)
        assertTrue (fecha.valida())
    }


    /**
     * Fecha invalida dia
     *
     */
    @Test
    fun fechaInvalidaDia() {
        val fecha = Fch(32, 5, 2022)
        assertFalse (fecha.valida())
    }

    /**
     * Fecha invalida mes
     *
     */
    @Test
    fun fechaInvalidaMes() {
        val fecha = Fch(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        assertFalse (fecha.valida())
    }

    /**
     * Fecha invalida febrero bisiesto
     *
     */
    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fch(29, 2, 2021)
        assertFalse (fecha.valida())
        println("Fecha invalida")
        println(fecha.valida())
    }

    /**
     * Fecha valida febrero bisiesto
     *
     */
    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fch(29, 2, 2024)
        assertTrue (fecha.valida())
        println("Fecha valida Bisiesto")
        println(fecha.valida())
    }




}