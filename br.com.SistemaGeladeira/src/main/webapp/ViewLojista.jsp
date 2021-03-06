<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View de Cadastro</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<form class="navbar-form navbar-left" role="search"
				action="/ViewProduto.jsp">
				<div class="form-group">
					<h3>Lojista cadastrado</h3>
					<div class="input-group input-group-lg">
						<span class="input-group-addon" id="sizing-addon1">@</span> <input
							type="text" class="form-control" placeholder="Login">
					</div>
					<div class="input-group input-group-lg">
						<input type="text" class="form-control" placeholder="Senha">
					</div>
					<div class="input-group input-group-lg">
						<button class="btn btn-primary" type="submit">Login</button>
					</div>



				</div>

			</form>
		</div>
	</nav>
	<form action="ServletLojista" method="post">

		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Cadastrados da loja</h3>
					</div>
					<p>inserir table</p>
				</div>

			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Cadastrados da loja</h3>
					</div>

					<div class="panel-body">
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Nome</span> <input
								type="text" class="form-control" placeholder="Nome Fantasia"
								name="nome" id="nome" aria-describedby="sizing-addon1" required>
						</div>
						<br>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Endere&ccedil;o</span>
							<input type="text" class="form-control" name="endereco"
								id="endereco" placeholder="Avenida Francisco Glicerio, 1936"
								aria-describedby="sizing-addon1" required>
						</div>
						<br>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">CNPJ</span> <input
								type="number" class="form-control" placeholder="39903017804"
								name="cnpj" id="cnpj" aria-describedby="sizing-addon1" required>
						</div>
						<br>
						<div class="fileinput fileinput-new" data-provides="fileinput">
							<div class="fileinput-new thumbnail"
								style="width: 200px; height: 150px;">
								<img data-src="holder.js/100%x100%" alt="...">
							</div>
							<div class="fileinput-preview fileinput-exists thumbnail"
								style="max-width: 2000px; max-height: 1500px;"></div>
							<div>
								<span class="btn btn-default btn-file"> <input
									type="file" name="..."></span> <a href=""
									class="btn btn-warning fileinput-exists"
									data-dismiss="fileinput">Remove</a>
								<div class="btn-group btn-group-left  role="
									group" aria-label="...">
									<button type="submit" class="btn btn-primary">Salvar
										Loja</button>
								</div>
							</div>

						</div>
					</div>
				</div>


			</div>
		</div>



	</form>

	<script>
		function logar() {
			document.getElementById("LoginLojista").submit;

		}
	</script>
</body>
</html>