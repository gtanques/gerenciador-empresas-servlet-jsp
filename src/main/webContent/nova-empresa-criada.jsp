<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>
	<c:if test="${not empty empresa}">
			Empresa ${ empresa }, Cadastrada com sucesso!
		</c:if>

	<c:if test="${empty empresa}">
			N�o foi poss�vel cadastrar empresa!
		</c:if>
</body>
</html>