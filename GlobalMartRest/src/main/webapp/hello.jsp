<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Page</title>
<script type="text/javascript"
		src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>

</head>
<body  ng-app="myApp" ng-controller="myCtrl">
<form ng-submit="myFunc()">
<div>
User name:	<input type="text" ng-model="uname" />  <p>Username: {{ uname }}</p>
Password :	<input type="password" ng-model="pass" />  <p>Password: {{ pass }}</p>

<select ng-model="selectedName" ng-options="x for x in names">
</select>
</div>

<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.names = ["Emil", "Tobias", "Linus"];
});
</script>

</body>
</html>