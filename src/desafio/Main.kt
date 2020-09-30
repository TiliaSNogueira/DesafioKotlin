package desafio

fun main() {

    val dhm = DigitalHouseManager()
    println("----    cursos    ----")
    dhm.resgistrarCurso("Full Stack", 20001, 3)
    dhm.resgistrarCurso("Android", 20002, 2)
    dhm.resgistrarCurso("Lógica de Programação", 20000, 4)
    dhm.excluirCurso(20000)

    println("----    professores    ----")
    dhm.registrarProfessorTitular("Bill", "Whiters", 100, "Java")
    dhm.registrarProfessorTitular("Michael", "Jackson", 101, "Kotlin")
    dhm.resgistrarProfessorAdjunto("Stevie", "Wonder", 200, 80)
    dhm.resgistrarProfessorAdjunto("Marvin", "Gaye", 201, 85)
    dhm.resgistrarProfessorAdjunto("Al", "Green", 202, 84)
    dhm.excluirProfessor(202)
    dhm.alocarProfessor(20001, 100, 200)
    dhm.alocarProfessor(20002, 101, 201)

    println("----    alunos    ----")
    dhm.matricularAluno("Fabrício", "Salomão", 941)
    dhm.matricularAluno("Lívia", "Nogueira", 8510)
    dhm.matricularAluno("Raphael", "Nogueira", 946)
    dhm.matricularAluno("Celso", "Raduan", 75)
    dhm.matricularAluno("Cleís", "Ferreira", 92)
    dhm.matricularAluno("Rafael", "Ferreira", 93)
    dhm.matricularAluno("Milaide", "Dude", 20)

    dhm.matricularAluno(75, 20001)
    dhm.matricularAluno(92, 20001)
    dhm.matricularAluno(93, 20001)
    dhm.matricularAluno(20, 20001)

    dhm.matricularAluno(941, 20002)
    dhm.matricularAluno(8510, 20002)
    dhm.matricularAluno(946, 20002)

    dhm.mostrarListaAtualizadaDeProfessores()
    dhm.mostrarListaAtualizadaDeAlunos()
    dhm.mostrarListaAtualizadaDeMatriculas()


}



