package desafio

data class ProfessorAdjunto(
        override val nome: String,
        override val sobrenome: String,
        override val tempoDeCasa: Int,
        override val codigoProfessor: Int,
        val horasMonitoria: Int,
) : Professor (nome, sobrenome, tempoDeCasa, codigoProfessor) {
}