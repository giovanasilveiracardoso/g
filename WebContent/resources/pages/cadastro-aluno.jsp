<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="grid-form">
	<div class="grid-form1">
		<h2 id="forms-example" class="">Cadastro de Aluno</h2>
		<form action="" method="post">
			<c:if test="${empty aluno.id}">
				<div class="form-group">
					<label for="id">Id</label>
					<input type="text" class="form-control" id="id" name="id" placeholder="Id" value="${aluno.id}">
				</div>
			</c:if>
			<div class="form-group">
				<label for="nome">Nome</label>
				<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome" value="${aluno.nome}">
			</div>
			<div class="form-group">
				<label for="idade">Idade</label>
				<input type="text" class="form-control" id="idade" name="idade" placeholder="Idade" value="${aluno.idade}">
			</div>
			<div class="form-group">
				<label for="cpf">CPF</label>
				<input type="text" class="form-control" id="cpf" name="cpf" placeholder="CPF" value="${aluno.cpf}">
			</div>
			<div class="form-group">
				<label for="dataDeNascimento">Data de Nascimento</label>
				<input type="text" class="form-control" id="dataDeNascimento" name="dataDeNascimento" placeholder="Data de Nascimento" value="${aluno.dataDeNascimento}">
			</div>
			<div class="form-group">
				<label for="disciplina">Disciplina</label>
				<div>
					<select name="idDisciplina" id="disciplina" class="form-control">
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
				</div>
			</div>
			<button type="submit" class="btn btn-default">Salvar</button>
		</form>
	</div>
</div>