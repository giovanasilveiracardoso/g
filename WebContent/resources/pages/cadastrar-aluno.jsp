<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div style="text-align:center">
		<h2>
			Cadastrar Aluno
		</h2>
			<form action="" method="post">
				<label>Id:
					<input type="text" name="id" />
				</label>
				<label>Nome:
					<input type="text" name="nome" />
				</label>
				<label>Idade:
					<input type="text" name="idade" />
				</label>
				<label>CPF:
					<input type="text" name="cpf" />
				</label>
				<label>Data de Nascimento:
					<input type="text" name="dataDeNascimento" />
				</label>
				<label>Disciplina
					<select name="idDisciplina">
						<c:choose>
						    <c:when test="${not empty listaDisciplinas}">
								<c:forEach var="disciplina" items="${listaDisciplinas}">
									<option value="${disciplina.id}">${disciplina.nome}</option>
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
