$(document).ready(function(e) {
	/*// Fancy Check box
	$('input').iCheck({
		checkboxClass : 'icheckbox_minimal-grey',
		radioClass : 'iradio_minimal-grey',
		increaseArea : '20%' // optional
	});
	*/
	$('#dateOfBirth,#AdmissionDate').datetimepicker({
		format : "DD/MM/YYYY",
		useCurrent : true
	});
	
});// end of ready
