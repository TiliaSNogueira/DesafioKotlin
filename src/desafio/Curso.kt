package desafio

data class Curso(
        val nome: String,
        val codigoCurso: Int,
        val quantidadeMaxAlunos: Int,
        var professorT: ProfessorTitular?,
        var professorA: ProfessorAdjunto?
) {


    var listaAlunosMatriculados: MutableList<Aluno> = mutableListOf<Aluno>()
    var contadorMatricula: Int = 0

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunosMatriculados.size < quantidadeMaxAlunos) {
            listaAlunosMatriculados.add(umAluno)
            println("Aluno ${umAluno.nome} matriculado com sucesso.")
            return true
        } else {
            println("Aluno ${umAluno.nome} não pode ser matriculado pois curso já atingiu limite de alunos.")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        println("Lista dos alunos do curso: $listaAlunosMatriculados")
        listaAlunosMatriculados.remove(umAluno)
        println("Aluno ${umAluno.nome} excluído com sucesso.")
        println("Lista atualizada dos alunos do curso: $listaAlunosMatriculados")
    }

}