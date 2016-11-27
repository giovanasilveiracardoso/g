<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<div>
		<h2>
			Alunos
		</h2>
		
		<c:if test="${not empty listaAlunos}">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Idade</th>
						<th>CPF</th>
						<th>Data de Nascimento</th>
						<th>Disciplina</th>
					</tr>
				</thead>
				<c:forEach var="aluno" items="${listaAlunos}">
					<tr>
						<td>${aluno.id}</td>
						<td>${aluno.nome}</td>
						<td>${aluno.idade}</td>
						<td>${aluno.cpf}</td>
						<td>${aluno.dataDeNascimento}</td>
						<td>${aluno.nomeDisciplina}</td>
						<td><a href="remover-aluno?id=${aluno.id}">Remover</a></td>
						<td><a href="alterar-aluno?id=${aluno.id}">Alterar</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
