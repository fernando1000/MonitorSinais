//comando para recarregar a pagina inteira: location.reload();

function procuraAlerta(tipoDeAlerta) {
	console.log("chamado procuraAlerta");
	
	var url = '/procuraAlerta/'+tipoDeAlerta;
	$("#tabelaAlertas").load(url);
	
	aplicaSombra(tipoDeAlerta);
}
function aplicaSombra(tipoAlerta){
	
	if(tipoAlerta === "Critico"){
		$(".alerts-type-crical").addClass("active");
	}else{
		$(".alerts-type-crical").removeClass("active");		    		
	}

	if(tipoAlerta === "Alerta"){
		$(".alerts-type-alert").addClass("active");
	}else{
		$(".alerts-type-alert").removeClass("active");		    		
	}

	if(tipoAlerta === "Normal"){
		$(".alerts-type-normal").addClass("active");
	}else{
		$(".alerts-type-normal").removeClass("active");		    		
	}
}

function carregaListaDeMacros() {
	console.log("chamando carregaListaDeMacros");

	var url = '/carregaListaDeMacros';
	$("#listaDeMacros").load(url);	
}

function carregaMenuLateral() {
	console.log("chamado carregaMenuLateral");

	var url = '/carregaMenuLateral';
	$("#menuLateral").load(url);	
}

function carregaContadoresAlertas() {
	console.log("chamado carregaContadoresAlertas");

	var url = '/carregaContadoresAlertas';
	$("#contadoresAlertas").load(url);	
}

function procuraFrota(nomeDaFrota) {

    var nomeSemEspaco = nomeDaFrota.replace(" ", "");
    
    var url = '/procuraFrota/'+nomeSemEspaco;
    $("#tabelaAlertas").load(url);
    
    var list = "#list"+nomeSemEspaco;
      $(list).toggleClass("selected");
    //  if($("#listTodosVeiculos #TodosVeiculos li").hasClass("selected")){
      $( "ol#TodosVeiculos li" ).each(function() {
          $( this ).css( "border-left", "3px solid #222833" );
          $("button").css( "color", "rgb(208, 216, 222)" );
      });
      
      $( "ol#FrotaPadrão li" ).each(function() {
          $( this ).css( "border-left", "3px solid #222833" );
          $("button").css( "color", "rgb(208, 216, 222)" );
      });
      
      $( "ol#FrotaOnibus li" ).each(function() {
          $( this ).css( "border-left", "3px solid #222833" );
          $("button").css( "color", "rgb(208, 216, 222)" );
      });
      
      $( "ol#FrotaCaminhoes li" ).each(function() {
          $( this ).css( "border-left", "3px solid #222833" );
          $("button").css( "color", "rgb(208, 216, 222)" );
      });

      adicionaVeiculosNaTelaDeMacro(nomeSemEspaco);
}

function adicionaVeiculosNaTelaDeMacro(nomeSemEspaco){

	console.log("adicionaVeiculosNaTelaDeMacro foi chamado...");
	
	var url = '/adicionaVeiculosNaTelaDeMacro/'+nomeSemEspaco;
	$("#veiculosMacros").load(url);
	
}

function removeItemClicado(nomeDaPlaca, tipoAlerta) {
	console.log("chamado removeItemClicado");

	var url = '/removeItemClicado/'+nomeDaPlaca;
	$("#tabelaAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){
		
		carregaMenuLateral();

		var url = '/carregaContadoresAlertas';
		$("#contadoresAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){
			
			if(tipoAlerta.includes("Normal")){
				procuraAlerta('Normal');
			}
			else if(tipoAlerta.includes("Alert")){
				procuraAlerta('Alerta');
			}
			else if(tipoAlerta.includes("Critical")){
				procuraAlerta('Critico');
			}
			else{
				procuraAlerta('Todos');
			}

		});
		
	});
	
}

function ativarSirene(nomeDaPlaca, tipoAlerta) {

	var url = '/ativarSirene/'+nomeDaPlaca;
	$("#tabelaAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){
		
			if(tipoAlerta.includes("Normal")){
				procuraAlerta('Normal');
			}
			else if(tipoAlerta.includes("Alert")){
				procuraAlerta('Alerta');
			}
			else if(tipoAlerta.includes("Critical")){
				procuraAlerta('Critico');
			}
			else{
				procuraAlerta('Todos');
			}

	});
	
}

function bloquearVeiculo(nomeDaPlaca, tipoAlerta) {

	var url = '/bloquearVeiculo/'+nomeDaPlaca;
	$("#tabelaAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){
		
			if(tipoAlerta.includes("Normal")){
				procuraAlerta('Normal');
			}
			else if(tipoAlerta.includes("Alert")){
				procuraAlerta('Alerta');
			}
			else if(tipoAlerta.includes("Critical")){
				procuraAlerta('Critico');
			}
			else{
				procuraAlerta('Todos');
			}

	});
	
}

function avisaVeiculoNaoAutorizado(){
	window.alert("veiculo nao autorizado");
}

$(document).ajaxStart(function(){
    $('#carregando').show();
 }).ajaxStop(function(){
    $('#carregando').hide();
});
