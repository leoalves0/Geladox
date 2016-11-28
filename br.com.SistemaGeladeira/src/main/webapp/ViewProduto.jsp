<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<meta charset="ISO-8859-1">
<title>GG - Cadastro de Produtos</title>
</head>
<body>

	<div>
		<h1 align="center">Nome da Loja</h1>
		<h1 align="center">Logotipo da Loja</h1>

		<br>
	</div>
	<div class="row">
		<div class="col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Produtos Cadastrados da loja</h3>
				</div>
					inserir table
				<div class="panel-body">
					<h1></h1>
				</div>
			</div>
		</div>
		<form action="ServletProduto" method="post"
			enctype="multipart/form-data">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Cadastrar produto novo</h3>
					</div>
					<div class="panel-body">
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Nome</span> <input
								type="text" class="form-control" placeholder="Nome do produto"
								name="nome" id="nome" aria-describedby="sizing-addon1" required>
						</div>
						<br>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Modelo</span>
							<input type="text" class="form-control"
								placeholder="modelo da geladeira" name="modelo" id="modelo"
								aria-describedby="sizing-addon2" required>
						</div>
						<br>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Fabricante</span>
							<input type="text" class="form-control"
								placeholder="Nome do fabricante" name="fabricante"
								id="fabricante" aria-describedby="sizing-addon3" required>
						</div>
						<br>
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">Cor</span> <input
								type="text" class="form-control" placeholder="Cor da geladeira"
								name="cor" id="cor" aria-describedby="sizing-addon4" required>
						</div>
						<br>
						<div>
							<label class="checkbox-inline"><input type="checkbox"
								value="Painel Blue Touch" name="caracteristicas">Painel
								Blue Touch</label> <label class="checkbox-inline"><input
								type="checkbox" value="Frost Free" name="caracteristicas">Frost
								Free</label> <label class="checkbox-inline"><input
								type="checkbox" value="Dispenser" name="checkbox">Dispenser</label>
						</div>
						<div>
							<label class="control-label">Select File</label> <input
								id="input-21" type="file" accept="image/*" class="file-loading">
							<script>
								$(document)
										.on(
												'ready',
												function() {
													$("#input-21")
															.fileinput(
																	{
																		previewFileType : "image",
																		browseClass : "btn btn-success",
																		browseLabel : "Pick Image",
																		browseIcon : "<i class=\"glyphicon glyphicon-picture\"></i> ",
																		removeClass : "btn btn-danger",
																		removeLabel : "Delete",
																		removeIcon : "<i class=\"glyphicon glyphicon-trash\"></i> ",
																		uploadClass : "btn btn-info",
																		uploadLabel : "Upload",
																		uploadIcon : "<i class=\"glyphicon glyphicon-upload\"></i> "
																	});
												});
							</script>
						</div>
						<br>
						<div class="btn-group btn-group-left  role="
							group" aria-label="...">
							<button type="submit" class="btn btn-primary">Salvar
								Produto</button>
						</div>

					</div>
				</div>
			</div>
		</form>

	</div>
</body>
</html>