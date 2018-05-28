<div class="container">

	<div class= "row">
		
		<div class="col-md-3">
		
			<%@include file="./shared/sidebar.jsp"%>
		
		</div>
	
		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-12">
					
					<c:if test="${userClickOnAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">all products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickOnCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active"> ${category.name} </li>
						</ol>
					</c:if>
					
					
				</div>

			</div>

			<div class="row">
				<div class="col-xs-12">
				 	<table id="productListTable" class="table table-striped table-bordered">
				 		<thead>
				 			<tr>
				 				<th>ID</th>
				 				<th>Name</th>
							</tr>
						</thead>
					</table>	
				</div>

</div>











		</div>	
	</div>



</div>