/**
 * 
 */
$(function(){
	
	switch(menu) { 
	
	case 'About us' : 
		$('#about').addClass('active');
		break;
	
	case 'Contact us':
		$('#contact').addClass('active');
		break;
		
	case 'showing all products':
		$('#listProducts').addClass('active');
		break;
		
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	
	}
	
	
	var products = [
	                ['1','ABC'],
	                ['2','CJK'],
	                ['3','ADF'],
	                ['4','AJK'],
	                ['5','ADFC'],
	                ['6','ABFDJK']
	                
	                ];
	
	var $table = $('#productListTable');
	
	if($table.length) {
		console.log('Inside The table');
		$table.DataTable({
			lengthMenu : [[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
			pageLength : 5,
			data : products
		});
		
	}	
});