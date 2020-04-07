# coursework
Созданы классы данных, которые хранят названия книг, авторов и литературных жанров. <br> 
Пример:<br>
    
    data class Author(
    val name:String
    )
    
    val authorList =
    arrayListOf(
        Author("George Orwell"),
        Author("Mikhail Bulgakov"),
        Author("Joanne Rowling"),
        Author("Arthur Conan Doyle"),
        Author("Oscar Wilde"),
        Author("John Tolkien"),
        Author("Stephen King")
        )
Данные классы выведены в виде списков.<br>
Пример:<br>
    
    authorList.map {
                ol {
                    +it.name
                }
            }
            
Результат представлен на следующих рисунках:<br>
![](/screen_coursework/интерфейс1.png)<br>
![](/screen_coursework/интерфейс2.png)<br>
