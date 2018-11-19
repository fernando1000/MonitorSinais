$.noConflict();
var $veiculo_grupo = "";
var $parceiro      = "";
jQuery(document).ready(function() {
	
	
	
    jQuery(".ObjectTree .Navigation button[type='button']").on('click', function(){
        jQuery(this).parents().find(".ObjectTree").toggleClass("collapsed");
    });

    
    //oculta subitens dos filtros
    if( jQuery(".group-list-item .group-item-list").length){
        jQuery(this).parents().find("group-list-item").addClass("expanded");
    } else{
        jQuery(this).parents().find("group-list-item").removeClass("expanded");
    }
    
    
	//GRID - mostrar box de ações
	jQuery(".AdministrationTable .table .tdActions .tdActions-Button").on("click", function(){
	    jQuery(this).next().toggleClass("active");
	});
	
	//mostra linha extendida do grid
	jQuery(".AdministrationTable .table .tdSee .btn").on("click", function(){
	    jQuery(this).parents().find(".extended").toggleClass("hide");
	});
	
	
	//Expand box acões (fora do grid)
	jQuery(".AdministrationTable .ActionsDropDown .dropdown").on("click", function(){
	    jQuery(this).toggleClass("open");
	});

	
	//Ação botão enviar mensagem
	/*
	jQuery(".AdministrationTable .btn-actions-message").on("click", function(){
	    jQuery(this).parents().find(".NavItems li a").removeClass("active");
	    jQuery(this).parents().find(".module-alerts").hide();
	    jQuery(this).parents().find(".NavItems .submodule-macros a").addClass("active");
	    jQuery(this).parents().find(".module-macro").show();
	});*/
	
	//abas
	jQuery(".ApplicationHeader .NavItems .nav-link-item a").each(function(){
	    jQuery(this).on("click", function(){
	        jQuery(".ApplicationHeader .NavItems .nav-link-item a").removeClass("active");
	        jQuery(this).addClass("active");
	        if( jQuery(this).parent().hasClass("submodule-macros") ){
	            jQuery(".modules-container").hide();
	            jQuery(".module-macros").show();
	        } else if(jQuery(this).parent().hasClass("submodule-alerts")){
	            jQuery(".modules-container").hide();
	            jQuery(".module-alerts").show();
	        }
	        else if(jQuery(this).parent().hasClass("submodule-share")){
	            jQuery(".modules-container").hide();
	            jQuery(".module-share").show();
	        }
	        else if (jQuery(this).parent().hasClass("submodule-routes")){
	            jQuery(".modules-container").hide();
	            jQuery(".module-routes").show();
	        }
	    });
	});


	/*	
	   jQuery(".generic-groups .generic-groups-item").each( function(){
	        jQuery(this).find(".generic-groups-button").on("click", function(){
	            jQuery(".generic-groups .generic-groups-item").removeClass("active");
	        	jQuery(this).parent().addClass("active");
	        	$parceiro = jQuery(this)[0].innerText;
	            $("#formularioCompartilhamento").val(jQuery(this)[0].innerText);
	        });
	    });	
	 */

	//mostra tooltip ativar sirene
	jQuery(".AdministrationTable .btn-actions-siren").on("click", function(){
	    jQuery(this).find(".popover").css("display","block");
	    setTimeout(function() {
	        jQuery(".AdministrationTable .btn-actions-siren .popover").hide();
	    }, 1000);
	        
	});
	
	//Resolvido - Remove elemento resolvido do grid
	jQuery(".AdministrationTable .btn-actions-resolve").on("click", function(){
	    jQuery(this).closest(".trItens").remove();
	        
	});
	
	//deleta filtro de veiculos
	
	if(jQuery(".SelectedFilterBar .list-inline .list-inline .SelectedFilterTag").length > 0)
	{
	    jQuery(".SelectedFilterBar .list-inline .list-inline .SelectedFilterTag").each( function(){
	        jQuery(this).on("click", function(){
	            jQuery(this).remove();
	        });
	    
	    });
	
	
	}
	
	//bloquear o veiculo
	
	jQuery(".AdministrationTable .tdActions .btn-actions-block, .AdministrationTable .btn-actions-block").click(function(e){
	    e.preventDefault();
	    jQuery(".AdministrationTable .tdActions-list").removeClass("active");
	    dataModal = jQuery(this).attr("data-modal");
	    jQuery("#" + dataModal).css({"display":"block"});
	    setTimeout(function() {
	        jQuery("#modal-name").hide();
	    }, 2000);
	        
	  });
	  
	
	jQuery("#mensagem-texto").click(function(){
		jQuery("#mensagem-texto").css({"display":"block"});
	    setTimeout(function() {
	        jQuery("#modal-mensagem").hide();
	    }, 2000);
	});
	
	jQuery(".content-share .AutoSuggest .row .btn").click(function(e){
	    e.preventDefault();
	    dataModal = jQuery(this).attr("data-modal");
	    jQuery("#" + dataModal).css({"display":"block"});
	    setTimeout(function() {
	        jQuery("#modal-share").hide();
	    }, 2000);
	  });
	
	jQuery(".content-macros .justify-content-around .col-sm-6 .btn").click(function(e){
	    dataModal = jQuery(this).attr("data-modal");
	    jQuery("#" + dataModal).css({"display":"block"});
	    jQuery("#modal-macro .btn-macro-remove").click(function(){
	        jQuery("#modal-macro .info-macro").css("display","block");
	        setTimeout(function() {
	            jQuery("#modal-macro .info-macro").css("display","none");
	            jQuery("#modal-macro").hide();
	        }, 2000);
	            
	    });
	    jQuery("#modal-macro .btn-macro-cancel").click(function(){
	        jQuery("#modal-macro").hide();

	    });
	    
	  });

	jQuery(".module-macros .list-macros .AutoSuggest .btn-primary").on("click", function(){
	    jQuery(this).next().css("display","block");

	    setTimeout(function() {
	        jQuery(".module-macros .list-macros .AutoSuggest .btn-primary").next().hide();
	    }, 2000);
	    
	});

	  
	/*Macros*/
	/*
	jQuery(".macros-groups").each( function(){
	    jQuery(this).find(".macros-groups-button").on("click", function(){
	    	
	        jQuery(".macros-groups .macros-groups-item").removeClass("active");
	        jQuery(this).parent().addClass("active");
	        
	    });
	    
	});
	 */


	jQuery(".module-share .table .trItens").each(function(){
	    jQuery(this).find(".tdCheck .table-expand").on("click", function(){
	        jQuery(this).parents().find(".trItens.expanded").toggleClass("visible");
	        jQuery(this).parents().closest(".trItens").toggleClass("expanded-minus");
	    });

	});



	

	jQuery(".table .trItens .btn-unshare").click(function(e){
	    e.preventDefault();
	    dataModal = jQuery(this).attr("data-modal");
	    jQuery("#" + dataModal).css({"display":"block"});

	    jQuery("#modal-unshare .btn-unshare-remove").click(function(){
	        jQuery("#modal-unshare .info-macro").css("display","block");
	        setTimeout(function() {
	            jQuery("#modal-unshare .info-macro").css("display","none");
	            jQuery("#modal-unshare").hide();
	        }, 2000);
	            
	    });
	    jQuery("#modal-unshare .btn-unshare-cancel").click(function(){
	        jQuery("#modal-unshare").hide();

	    });


	  });
	
	
	 jQuery(".btn-actions-resolve-lote").on("click", function(){

	        var arr = [];
	        var selected = [];
	        var i = 0, j = 0;

	        jQuery('#tablelist tr ').each(function() {
	            j++;
	           if(jQuery(this).children().children().children().children().prevObject[0].children[1].previousElementSibling.checked){
	               arr.push(
	                    jQuery(this).children()[1].innerText
	               );
	               
	                i++;
	           }

	        });

	        for (i = 0; i < arr.length; i++) { 
	            // console.log('total arr = ' + arr[i]);
	        }
	        
	        //window.location = 'http://localhost:8080/removeItemClicadoLote/{' + arr + '}';        
	            
	        var url = '/removeItemClicadoLote/{' + arr + '}';        
	        removeItemClicadoLote(url);
	        
	    });
	 
	    jQuery(".content-share .AutoSuggest .row .btn").click(function(e){
	        dataModal = jQuery(this).attr("data-modal");
	        jQuery("#" + dataModal).css({"display":"block"});
	        jQuery("#modal-share");
	      });
	     
	    jQuery(".table .trItens .btn-unshare").click(function(e){
		        e.preventDefault();
		        dataModal = jQuery(this).attr("data-modal");
		        var parent = $(this).closest('tr'); 
		        console.log(parent[0].children[1].innerText);
		        console.log(parent[0].children[2].innerText);
		        var parent_veiculo  = parent[0].children[1].innerText;
		        var parent_parceiro = parent[0].children[2].innerText;
		        jQuery("#" + dataModal).css({"display":"block"});
	
		        jQuery("#modal-unshare .btn-unshare-remove").click(function(){
		            jQuery(this).parents().closest(".trItens").remove();
		            jQuery("#modal-unshare .info-macro").css("display","block");
		            setTimeout(function() {
		                jQuery("#modal-unshare .info-macro").css("display","none");
		                jQuery("#modal-unshare").hide();
		                window.location = 'http://34.255.101.198:8080/removeCompartilhamento/{'+ parent_veiculo +'}/{'+ parent_parceiro +'}';     
		            }, 2000);
		        });
		        
		        jQuery("#modal-unshare .btn-unshare-cancel").click(function(){
		            jQuery("#modal-unshare").hide();
	
		        });
	      });
	    
	    jQuery(".routes-groups-sublist .btn-routes-select").on("click", function(){
	        jQuery(this).parents().find(".route-list-group").toggleClass("selected");
	    });

	    var arrayWithFooValues = [];
        jQuery(".route-list-group .list-rout-content .rout-content-button").each( function(i){
            jQuery(this).click(function(){

                jQuery(this).toggleClass("selected");
                if(jQuery(this)[0].attributes[1].value === "rout-content-button"){
                    var index = arrayWithFooValues.indexOf(jQuery(this).find(".list-route-icon").text());
                     
                    if (index > -1) {
                        arrayWithFooValues.splice(index, 1);
                    }                    
                    
                }else{
                    arrayWithFooValues.push(
                        jQuery(this).find(".list-route-icon").text()
                    );
                    
                    jQuery(".routes-groups-sublist .form-control").html("<span class=\"valorRota\">" + arrayWithFooValues + ", <span>" );
                }
                jQuery(".routes-groups-sublist .form-control").html("<span class=\"valorRota\">" + arrayWithFooValues + " <span>" );
                
            });   
        });

	    jQuery(".routes-groups-sublist .btn-routes-add").on("click",function(){
	        jQuery(this).parents().find(".route-list-group").removeClass("selected");
	        jQuery(this).parents().find(".routes-groups-sublist .alert-success").css("display","block");
	        
	        setTimeout(function() {
	            jQuery(".routes-groups-sublist .alert-success").css("display","none");
	        }, 2000);    
	    });
	
});

function removeItemClicadoLote(url) {

	console.log("url foi chamado com: "+url);
	
	$("#tabelaAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){
		
		carregaMenuLateral();

		var url = '/carregaContadoresAlertas';
		$("#contadoresAlertas").load(url, function(responseText, textStatus, XMLHttpRequest){

			procuraAlerta('Todos');
		});
	});
}

function sortTable(n) {
	  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
	  table = document.getElementById("customerTable");
	  
	  switching = true;
	  //Set the sorting direction to ascending:
	  dir = "asc"; 

	  while (switching) {

	    switching = false;
	    rows = table.rows;

	    for (i = 1; i < (rows.length - 1); i++) {

	    	
		    try{	
		      shouldSwitch = false;
	
		      x = rows[i].getElementsByTagName("TD")[n];
		      y = (rows[i + 1].getElementsByTagName("TD")[n] === 'undefined')? null : rows[i + 1].getElementsByTagName("TD")[n];
		      console.log(x);
		      if (dir == "asc") {

				if (typeof(y.innerHTML.toLowerCase()) === 'undefined') {
					dir = "desc";
				    shouldSwitch= true;
				    break;
				}		    	  
				if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
					jQuery( 'span#sort-asc' + n + '.sort-icon').css( "opacity"," 1"); 
					jQuery( 'span#sort-desc' + n + '.sort-arrows.sort-desc span.sort-desc').css( "!important opacity:"," 0.2");
					jQuery( 'span#sort-desc' + n + '.sort-arrows.sort-desc span.sort-desc').attr('style','opacity: 0.2');
				  shouldSwitch= true;
				  break;
				}
		    	
		      } else if (dir == "desc") {
		    	  jQuery( 'span#sort-asc' + n + '.sort-icon').css( "!important opacity:"," 0.2");  
		    	  jQuery( 'span#sort-asc' + n + '.sort-icon').attr('style','opacity: 0.2');
		    	  jQuery( 'span#sort-desc' + n + '.sort-arrows.sort-desc span.sort-desc').attr('style','opacity: 1');
	
		        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
		        	console.log('desc xxxxxxxxxxxx');
		        	jQuery( 'span#sort-asc' + n + '.sort-icon').css( "!important opacity:"," 0.2"); 
		        	jQuery( 'span#sort-desc' + n + '.sort-arrows.sort-desc span.sort-desc').css( "!important opacity:"," 1"); 
		          //if so, mark as a switch and break the loop:
		          shouldSwitch = true;
		          break;
		        }
		      }
		    }catch(e){
		    	 if (e instanceof TypeError) {
		    	        printError(e, true);
		    	    } else {
		    	        printError(e, false);
		    	    }
		    }
	    }
	    if (shouldSwitch) {

	      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
	      switching = true;
	      switchcount ++;      
	    } else {

	      if (switchcount == 0 && dir == "asc") {
	        dir = "desc";
	        jQuery( 'span#sort-asc' + n + '.sort-icon').css( "opacity:"," 0.2"); 
	        jQuery( 'span#sort-desc' + n + '.sort-arrows.sort-desc span.sort-desc').attr('style','opacity: 1');
	        switching = true;
	      }
	    }
	  }
	}
	var printError = function(error, explicit) {
	  //  console.log(`[${explicit ? 'EXPLICIT' : 'INEXPLICIT'}] ${error.name}: ${error.message}`);
	}
 

	
	