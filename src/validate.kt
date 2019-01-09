
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLInputElement
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    window.onload = {
        val button = document.getElementById("submitButtonId") as HTMLElement
        button.addEventListener("click", {
            validate()
        })
    }
}

fun validate() {
    val firstNameInput = document.getElementById("firstNameId") as HTMLInputElement
    val firstName = firstNameInput.value
    if (!firstName.matches("[a-zA-Z -]+")) {
        println("Error in first name!")
    }
}