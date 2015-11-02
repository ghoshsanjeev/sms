smsApp.controller("smsController", function($scope, $http) {
	/*this will be removed later*/
	function getYears(offset, range){
        var currentYear = new Date().getFullYear();
        $scope.selectedYear=currentYear;
        var years = [];
        for(var i=currentYear-range;i<currentYear+range;i++){
        	years.push(i);
        }
        /*for (var i = 0; i < range + 1; i++){
            years.push(currentYear + offset + i);
        }*/
        return years;
    }
	$scope.years=getYears(0, 20);
	
	function getMonths(){
        var months = [];
        for (var i = 1; i <=12; i++){
            months.push(i);
        }
        return months;
    }
	$scope.months=getMonths();
	$scope.classess=$scope.months;
	$scope.selectedMonth = $scope.months[(new Date().getMonth())-1];
	//---------------------------------------------------------------------------
});//end of controller