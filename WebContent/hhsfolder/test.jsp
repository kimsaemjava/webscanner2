<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
	<a class="navbar-brand" href="#">WebScanner</a>
	<!--��� �޴�  -->
  	<ul class="navbar-nav ml-auto">
      <li class="active"><a class="nav-link text-center" href="#">Home</a></li>
      <li><a class="nav-link text-center" href="#">Page 1</a></li>
      <li><a class="nav-link text-center" href="#">Page 2</a></li>
    </ul>
    <!--��ܸ޴� ��  -->
	<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <!--���̵�޴� ����  -->
    <div class="collapse navbar-collapse" id="navbarResponsive">
    <ul class ="navbar-nav navbar-sidenav" id="exampleAccordion">
    <!-- ���̵� �޴� - ��ü�˻�  -->
    	<li class="nav-item" data-toggle="tooltip" data-placement="right" title data-original-title="��ü�˻�">
    	 <a class="nav-link" href="#">
    	 	<i class="fa fa-fw fa-dashboard"></i>
    	 	<span class="nav-link-text">��ü�˻�</span>
    	 </a>
    	</li>
    <!-- ���̵� �޴� - ��ü�˻� ��  -->
    <!-- ���̵� �޴� - �κа˻� ����  -->
    <li class="nav-item" data-toggle="tooltip" data-placement="right" title="" data-original-title="�κа˻�">
          <a class="nav-link nav-link-collapse" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion" aria-expanded="true">
            <i class="fa fa-fw fa-wrench"></i>
            <span class="nav-link-text">�κа˻�</span>
          </a>
          <ul class="sidenav-second-level collapse show" id="collapseComponents" style="">
            <li>
              <a href="#">������</a>
            </li>
            <li>
              <a href="#">����� ����</a>
            </li>
            <li>
              <a href="#">�ΰ��� ������ ����</a>
            </li>
            <li>
              <a href="#">XSS</a>
            </li>
            <li>
              <a href="#">����� ��������</a>
            </li>
          </ul>
        </li>
            <!-- ���̵� �޴� - �κа˻� ��  -->
            
    </ul>
        <!-- ���̵� �޴� - �� -->
        
        <!-- ���̵� �ϴ� �޴� -����  -->
      	<!-- ���̵� �ϴ� �޴� -�� -->
      	<!-- ��� �޴� -����  -->
        <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">
            <i class="fa fa-fw fa-sign-out"></i>�α׾ƿ�</a>
        </li>
        </ul>
        <!-- ��� �޴� - �� -->
    </div>
<nav>

</body>
</html>