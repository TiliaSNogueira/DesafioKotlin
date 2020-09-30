package desafio

class DigitalHouseManager(

        val listaAlunos: MutableMap<Int, Aluno> = mutableMapOf(),
        val listaDeProfessores: MutableMap<Int, Professor> = mutableMapOf<Int, Professor>(),
        val listaCurso: MutableMap<Int, Curso> = mutableMapOf<Int, Curso>(),
        val listaMatriculas: MutableList<Matricula> = mutableListOf<Matricula>()
) {


    //ok
    fun resgistrarCurso(nome: String, codigoCurso: Int, quantidadeMaxAlunos: Int) {
        val cursoCriado = Curso(nome, codigoCurso, quantidadeMaxAlunos, null, null)
        println("Curso $nome criado com sucesso / Código do curso: $codigoCurso / Quantidade máxima de alunos: $quantidadeMaxAlunos.")
        listaCurso.put(codigoCurso, cursoCriado)
    }

    //ok
    fun excluirCurso(codigoCurso: Int) {
        println("Curso ${listaCurso[codigoCurso]?.nome} excluído com sucesso.")
        listaCurso.remove(codigoCurso)
    }

    fun resgistrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHorasMonitoria: Int) {
        val novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHorasMonitoria)
        listaDeProfessores.put(codigoProfessor, novoProfessorAdjunto)
        println("Professor adjunto ${novoProfessorAdjunto.nome} registrado com sucesso.")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoProfessorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfessores.put(codigoProfessor, novoProfessorTitular)
        println("Professor titular ${novoProfessorTitular.nome} registrado com sucesso.")
    }

    //ok
    fun excluirProfessor(codigoProfessor: Int) {
        println("Professor ${listaDeProfessores[codigoProfessor]?.nome} excluído com sucesso.")
        listaDeProfessores.remove(codigoProfessor)
    }

    //ok
    //cria aluno e adiciona à listaAlunos
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val alunoMatriculado = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.put(codigoAluno, alunoMatriculado)
        println("Aluno ${alunoMatriculado.nome} matriculado com sucesso")
    }

    //ok
    fun alocarProfessor(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        var cursoEscolhido = listaCurso[codigoCurso]
        var profTitularEscolhido = listaDeProfessores[codigoProfessorTitular]
        var profAdjuntoEscolhido = listaDeProfessores[codigoProfessorAdjunto]

        if (cursoEscolhido != null) {
            cursoEscolhido.professorA = profAdjuntoEscolhido as ProfessorAdjunto?
        }

        if (cursoEscolhido != null) {
            cursoEscolhido.professorT = profTitularEscolhido as ProfessorTitular?
        }

        if (cursoEscolhido != null) {
            println("Professores ${cursoEscolhido.professorT?.nome} e ${cursoEscolhido.professorA?.nome} alocados ao ${cursoEscolhido.nome}.")
        }
    }

    //matricula um aluno em um curso
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        var matricula = Matricula(null, null, null)
        var cursoMatricula = listaCurso[codigoCurso]
        var alunoMatriculando = listaAlunos[codigoAluno]

        if (cursoMatricula != null) {
            if (cursoMatricula.quantidadeMaxAlunos > cursoMatricula.contadorMatricula) {
                matricula.curso = cursoMatricula
                matricula.aluno = alunoMatriculando
                listaMatriculas.add(matricula)
                cursoMatricula.contadorMatricula++
                println("Aluno ${matricula.aluno} matriculado no curso de ${matricula.curso}")
            } else {
                println("Matricula não pode ser efetuada pois não há vagas disponíveis")
            }
        }
    }

    // imprimir as listas completas
    fun mostrarListaAtualizadaDeProfessores() {
        println("Lista atualizada de professores: $listaDeProfessores")
    }

    fun mostrarListaAtualizadaDeAlunos() {
        println("Lista atualizada de alunos cadastrados: ${listaAlunos}")
    }

    fun mostrarListaAtualizadaDeMatriculas() {
        println("Lista atualizada de alunos matriculados e seus respectivos cursos: $listaMatriculas")
    }


}


