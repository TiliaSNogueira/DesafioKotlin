package desafio

data class ProfessorTitular(
        override val nome: String,
        override val sobrenome: String,
        override val tempoDeCasa: Int,
        override val codigoProfessor: Int,
        val especialidade: String
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {


}