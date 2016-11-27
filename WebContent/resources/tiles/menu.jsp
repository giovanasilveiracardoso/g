<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>		
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
				</a>
			</header>
			<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
			<div class="menu">
				<ul id="menu">
					<li id="menu-academico">
						<a href="<c:url value='/' />aluno/listar-alunos">
							<i class="fa fa-list-ul" aria-hidden="true"></i>
							<span>Alunos</span>
							<span class="fa fa-angle-right" style="float: right"></span>
						</a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes">
								<a href="<c:url value='/' />aluno/cadastrar-aluno">Cadastrar</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>