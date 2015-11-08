smsApp.controller("smsController", function($scope, $timeout, $http, $q,
		WebServices) {
	/* this will be removed later */
	$scope.monthNames = [ "", "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November",
			"December" ];

	function getYears(offset, range) {
		var currentYear = new Date().getFullYear();
		$scope.selectedYear = currentYear;
		var years = [];
		for (var i = currentYear - range; i < currentYear + range; i++) {
			years.push(i);
		}
		/*
		 * for (var i = 0; i < range + 1; i++){ years.push(currentYear + offset +
		 * i); }
		 */
		return years;
	}
	$scope.years = getYears(0, 20);

	function getMonths() {
		var months = [];
		for (var i = 1; i <= 12; i++) {
			months.push($scope.monthNames[i]);
		}
		return months;
	}
	function getClasses() {
		var classes = [];
		for (var i = 5; i <= 12; i++) {
			classes.push(i);
		}
		return classes;
	}
	$scope.months = getMonths();
	$scope.classes = getClasses();
	$scope.selectedMonth = $scope.months[(new Date().getMonth())];
	// ---------------------------------------------------------------------------
	$scope.student = {
		"studentType" : "",
		"firstName" : "",
		"lastName" : "",
		"sex" : "",
		"currentAddress" : {
			"addressLine1" : "",
			"addressLine2" : "",
			"streetName" : "",
			"villageOrTown" : "",
			"postOffice" : "",
			"policeStation" : "",
			"district" : "",
			"pincode" : ""
		},
		"permanentAddress" : {
			"addressLine1" : "",
			"addressLine2" : "",
			"streetName" : "",
			"villageOrTown" : "",
			"postOffice" : "",
			"policeStation" : "",
			"district" : "",
			"pincode" : ""
		},
		"gurdianName" : "",
		"motherName" : "",
		"dateOfBirth" : "",
		"religion" : "",
		"caste" : "",
		"bpl" : "",
		"idMark" : "",
		"contactNo" : "",
		"class_" : "6",
		"rollNo" : "",
		"section" : 'A',
		"stream" : "",
		"subject" : "",
		"fees" : "",
		"feesAmt" : "",
		"emailID" : "",
		"yearOfPassing" : "",
		"remark" : "",
		"admissionDate" : ""
	}

	$('#dateOfBirth,#AdmissionDate').on(
			"dp.change",
			function(e) {
				$scope.student.dateOfBirth = $('#dateOfBirth,#AdmissionDate')
						.data().date;
				$timeout(function() {
					$scope.$apply();
				});
			});
	$("select[id='class'],select[id='section']").on('change',function(){
		WebServices._post("./getRollNo",$scope.student).then(function(value) {
			$scope.student.rollNo = value.data.rollNo;
			$timeout(function() {
				$scope.$apply();
			});
		}, function(reason) {

		}, function(value) {

		});
	});
	

	$("#saveButton").click(
			function() {
				console.log("button clicked");
				console.log($scope.student);
				WebServices._post("./createStudent", $scope.student).then(
						function(value) {

						}, function(reason) {

						}, function(value) {

						});
			});// end of on

});// end of controller
