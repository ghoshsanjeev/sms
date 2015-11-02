$(document).ready(function(e) {
	// Fancy Check box
	$('input').iCheck({
		checkboxClass : 'icheckbox_minimal-grey',
		radioClass : 'iradio_minimal-grey',
		increaseArea : '20%' // optional
	});
	
	$('#dateOfBirth').datetimepicker({
		format : "DD/MM/YYYY",
		useCurrent : false
	});
	
	
});// end of ready
