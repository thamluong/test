$(function() {
	$('.add').click(function(){
		$('.div-add').load("update", "id="+$('.id').val()+"&name="+$('.name').val()+"&salary="+$('.salary').val()
				, function(){
			//alert("added: " + $('.id').text()+" - "+$('.name').text()+" - "+$('.salary').text());
		})
	})
})