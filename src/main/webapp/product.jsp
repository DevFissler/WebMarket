<%@page import="com.survival.data.ProductRepository" %>
  <%@page import="com.survival.domain.model.Product" %>
  <%@ page import="java.text.DecimalFormat"%>
    <%@page import="java.util.List" %>
      <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <jsp:useBean id="repository" class="com.survival.data.ProductRepository" scope="session"></jsp:useBean>
        <html>

        <head>
          <meta charset="UTF-8">
          <title>상품 정보</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        </head>

        <body>
          <jsp:include page="menu.jsp"></jsp:include>

          <div class="p-5 bg-primary text-white">
            <div class="container">
              <h1 class="display-3">상품 정보</h1>
            </div>
          </div>

          <% String id=request.getParameter("id"); 
          	Product product=repository.getProductById(id);
          	DecimalFormat df = new DecimalFormat("###,###,###,###,###");%>
            <div class="container" style=margin-top:30px>
              <div class="row">
                <div class="col-md-6">
                  <h3>
                    <%=product.getName()%>
                  </h3>
                  <p>
                    <%=product.getDescription()%>
                  </p>
                  <p><b>상품 코드 : </b><%= product.getId() %></p>
                  <p><b>제조사 : </b><%= product.getManufacturer() %></p>
                  <p><b>분류 : </b><%= product.getCategory() %></p>
                  <p><b>재고 수 : </b><%= df.format(product.getUnitsInStock()) %>개</p>
                  <p><b>가격 : <%=df.format(product.getUnitPrice()) %>원</b></p>
                  <p><a href="" class="btn btn-info">상품 주문 &raquo;</a></p>
                  <a href="products.jsp" class="btn btn-secondary">상품 목록 &raquo;</a>
                </div>
              </div>
              <div class="col-md-6">
              	<img src="<%= product.getId() %>.jpg">
              </div>
            </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </body>

        </html>