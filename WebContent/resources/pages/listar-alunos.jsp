<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
    $(document).ready(function() {
      $('#table').basictable();
    });
</script>
<div class="agile-grids">
	<div class="agile-tables">
		<div class="w3l-table-info">
			<h2>Alunos</h2>
		
			<c:if test="${not empty listaAlunos}">
			    <table id="table" class="">
					<thead>
					  <tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Idade</th>
						<th>CPF</th>
						<th>Data de Nascimento</th>
						<th>Disciplina</th>
						<th colspan="2">Opções</th>
					  </tr>
					</thead>
					<tbody>
						<c:forEach var="aluno" items="${listaAlunos}">
						  <tr>
							<td data-th="Id"><span class="bt-content">${aluno.id}</span></td>
							<td data-th="Nome"><span class="bt-content">${aluno.nome}</span></td>
							<td data-th="Idade"><span class="bt-content">${aluno.idade}</span></td>
							<td data-th="CPF"><span class="bt-content">${aluno.cpf}</span></td>
							<td data-th="Data de Nascimento"><span class="bt-content">${aluno.dataDeNascimento}</span></td>
							<td data-th="Disciplina"><span class="bt-content">${aluno.nomeDisciplina}</span></td>
							<td><a href="remover-aluno?id=${aluno.id}">Remover</a></td>
							<td><a href="alterar-aluno?id=${aluno.id}">Alterar</a></td>
						  </tr>
						</c:forEach>
					</tbody>
			  	</table>
			</c:if>
		</div>
	</div>
</div>