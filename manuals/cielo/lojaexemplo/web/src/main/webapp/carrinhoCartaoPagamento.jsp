<%@page import="java.util.Date"%>
<%@page import="br.com.cbmp.ecommerce.pedido.Pedido"%>
<%@page import="br.com.cbmp.ecommerce.resposta.Transacao"%>
<%@page import="br.com.cbmp.ecommerce.util.web.WebUtils"%>
<%@ page errorPage="novoPedidoErro.jsp" %>

<%
	WebUtils webUtils = new WebUtils(request);
	Pedido pedido = webUtils.criarPedido();
	pedido.finalizarComAutorizacaoDireta();
	
	getServletConfig().getServletContext().getRequestDispatcher("/retorno.jsp").forward(request, response);
%>