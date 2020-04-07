import data.authorList
import kotlin.browser.document
import data.bookList
import data.genreList
import kotlinx.html.dom.append
import kotlinx.html.js.*



fun main() {
    document.getElementById("root")!!
        .append {
            h1 {
                +"Catalog"
            }
            val heading = arrayOf("Book", "Author", "Genre")
            heading.map {
                h2 {
                    +it
                }
            }
            h2 {
                +heading[0]
            }
            bookList.map {
                ol {
                    +" ${it.title}"
                }

            }
            h2 {
                +heading[1]
            }
            authorList.map {
                ol {
                    +it.name
                }
            }
            h2 {
                +heading[2]
            }
                genreList.map {
                    ol {
                        +it.style
                    }
                }
            }
    }


