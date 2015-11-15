

smsApp.directive('yearDrop',function(){
   	function getYears(offset, range){
        var currentYear = new Date().getFullYear();
        var years = [];
        for (var i = 0; i < range + 1; i++){
            years.push(currentYear + offset + i);
        }
        return years;
    }
    return {
        link: function($scope,element,attrs){
            $scope.years = getYears(+attrs.offset, +attrs.range);
            $scope.selectedYear = $scope.years[0];
        },
        template: '<select ng-model="selectedYear" ng-options="y for y in years"></select>'
    }
});

smsApp.directive('monthDrop',function(){
   	function getMonths(){
        var months = [];
        for (var i = 1; i <=12; i++){
            months.push(i);
        }
        return months;
    }
    return {
        link: function($$scope,element,attrs){
            $scope.months = getMonths();
            $scope.selectedMonth = $scope.months[(new Date().getMonth())-1];
        },
        template: '<select ng-model="selectedMonth" ng-options="m for m in months"></select>'
    }
});