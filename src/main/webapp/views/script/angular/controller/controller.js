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
		return years;
	}
	$scope.years = getYears(0, 50);

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
	$scope.selectedClass="";
	$scope.selectedYear="";
	$scope.student = {
		"studentType" : "new",
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
		"class_" : "",
		"rollNo" : "",
		"section" : '',
		"stream" : "",
		"subject" : "",
		"fees" : "",
		"feesAmt" : "64",
		"emailID" : "",
		"yearOfPassing" : "",
		"remark" : "",
		"admissionDate" : ""
	}

	$('#dateOfBirth').on(
			"dp.change",
			function(e) {
				$scope.student.dateOfBirth = $('#dateOfBirth')
						.data().date;
				$timeout(function() {
					$scope.$apply();
				});
			});
	
	$('input[id="AdmissionDate"]').on(
			"dp.change",
			function(e) {
				$scope.student.admissionDate = $('input[id="AdmissionDate"]')
						.data().date;
				console.log($scope.student.admissionDate);
				$timeout(function() {
					$scope.$apply();
				});
			});
	$("input[name='studentType']:radio").on('change',function () {
		$scope.student.rollNo="";
		$timeout(function() {
			$scope.$apply();
		});
	});
	$("select[id='class'],select[id='section']").on('change',function(){
		$scope.student.class_=$scope.selectedClass;
		
		$timeout(function() {
			$scope.$apply();
		});
		if($scope.student.studentType=="new"){
			WebServices._post("./getRollNo",$scope.student).then(function(value) {
				$scope.student.rollNo = value.data.rollNo;
				$timeout(function() {
					$scope.$apply();
				});
			}, function(reason) {

			}, function(value) {

			});
		}
	});
	

	$("#saveButton").on('click',function() {
		console.log("button clicked");
		console.log($scope.student);
		$scope.student.yearOfPassing=$scope.selectedYear;
		$scope.student.class_=$scope.selectedClass;
		if($scope.student.sameAddress){
			$scope.student.currentAddress=$scope.student.permanentAddress;
		}
		$timeout(function() {
			$scope.$apply();
		});
		WebServices._post("./createStudent", $scope.student).then(
			function(value) {
				if(value.data){
					console.log("Student Record has been created successfully");
				}else{
					console.log("Student Record can not be created.")
				}
			}, function(reason) {

			}, function(value) {

			});//end of post call
		});// end of on

});// end of controller
