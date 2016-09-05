<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<title>Hello World</title>
<script type="text/javascript" language="JavaScript">
	function clickedButton() {

		window.location = 'UserManagement.jsp'

	}
</script>
</head>
<body>

	<form name="login_form" method="post">
		<input type="button" value="Login" onClick="clickedButton()" />
	</form>
</body>
</html>