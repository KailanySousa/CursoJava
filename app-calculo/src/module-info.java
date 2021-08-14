module app.calculo {
	
	exports br.com.ksg.app.calculo;
	requires transitive app.logging;
	
	exports br.com.ksg.app.calculo.interno to app.financeiro;
	
	
//	opens br.com.ksg.app.calculo;
//	opens br.com.ksg.app.calculo to app.financeiro;
}