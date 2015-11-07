smsApp.factory('WebServices',['$http', '$q',function($http , $q){
	
	return {
	_get : function(url){
		var deferred = $q.defer();
		$http.get(url).then(
		//success callback
		function(resp){
			 deferred.resolve(resp);
		},
		function(error){
		//error callback
			deferred.reject(error);
		});
		return deferred.promise;
	},
	
	_post : function(url,data){
		console.log(url)
		var deferred = $q.defer();
		$http.post(url,data).then(
			//success callback
			function(resp){
				console.log(resp)
				deferred.resolve(resp);
			},
			function(error){
			//error callback
			deferred.reject(error);	
		});
		
		return deferred.promise;
	},
	_put : function(){
		var deferred = $q.defer();
		$http.put(url,data).then(
				//success callback
				function(resp){
					deferred.resolve(resp);
				},
				function(error){
				//error callback
					deferred.reject(error);	
			});
		return deferred.promise;
	},
	_delete : function(){
		var deferred = $q.defer();
		$http.delete(url).then(
				//success callback
				function(){
					deferred.resolve(gridData);
				},
				function(resp){
				//error callback
					deferred.reject(error);	
			});
		return deferred.promise;
	}
	}
	
}]);

