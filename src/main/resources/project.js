function save(){
	
var url="https://jsonplaceholder.typicode.com/users"
  var objquestion={};
  objquestion.Title=$('#txttitle').val();
  objquestion.Description=$('#txtdescription').val();

  if(objquestion){
     $.ajax(
      {
        url:url,
        contentType="application/json; charset=utf-8",
        dataType="json",
        data: JSON.stringify(objquestion),
        type="post",
        success: function (result) {
          alert(result);
        },
        error: function(msg){
          alert(msg);
        }


      }
     );
  }
}