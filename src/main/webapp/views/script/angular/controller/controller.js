smsApp.controller("smsController", function($scope, $http) {
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
});// end of controller
