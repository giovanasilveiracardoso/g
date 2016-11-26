<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div style="text-align:center">
		<h2>
			Editar Aluno
		</h2>
			<form action="" method="post">
				<input type="hidden" name="id" value="${aluno.id}" />
				
				<label>Nome:
					<input type="text" name="nome" value="${aluno.nome}" />
				</label>
				<label>Idade:
					<input type="text" name="idade" value="${aluno.idade}" />
				</label>
				<label>CPF:
					<input type="text" name="cpf" value="${aluno.cpf}" />
				</label>
				<label>Data de Nascimento:
					<input type="text" name="dataDeNascimento" value="${aluno.dataDeNascimento}" />
				</label>
				<label>Disciplina
					<select name="idDisciplina">
						<c:choose>
						    <c:when test="${not empty listaDisciplinas}">
								<c:forEach var="disciplina" items="${listaDisciplinas}">
									<c:choose>
									    <c:when test="${aluno.idDisciplina eq disciplina.id}">
											<option value="${disciplina.id}" selected="selected">${disciplina.nome}</option>
										</c:when>
										<c:otherwise>
											<option value="${disciplina.id}">${disciplina.nome}</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
						    </c:when>    
						    <c:otherwise>
						    	<option>Nenhuma displina cadastrada</option>
						    </c:otherwise>
						</c:choose>
					</select>
				</label>				
				
				<input type="submit" value="Enviar">
			</form>
	</div>
