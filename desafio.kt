// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val id: Int, var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

   val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
//         TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

// fun main() {
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
// }
// 
fun main() {
   val user1 = Usuario(1, "Ricardo")
   val user2 = Usuario(2, "Diogo")
   val conteudoEducacional = ConteudoEducacional("Kotlin")
   val conteudoEducacional2 = ConteudoEducacional("Java")
   val conteudos = mutableListOf<ConteudoEducacional>()
   conteudos.add(conteudoEducacional)
   conteudos.add(conteudoEducacional2)
   
	val formacao1 = Formacao("Kotlin", conteudos)
    
    formacao1.matricular(user1)
    formacao1.matricular(user2)
    
   	println(user1.nome + " " + user1.id)
    println(user2.nome + " " + user2.id)
    println(conteudos)
    println(formacao1.nome)
    println(formacao1)      
  
}
