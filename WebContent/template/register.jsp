<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>WebScanner - ȸ������</title>
  <!-- Bootstrap core CSS-->
  <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="../css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">ȸ������</div>
      <div class="card-body">
        <form action="/webscanner/login.do" method="POST">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-12">
                <label for="InputName">Name</label>
                <input class="form-control" id="Name" type="text" aria-describedby="nameHelp" placeholder="�̸�">
              </div>
               </div>
          </div>
          <div class="form-group">
            <label for="InputEmail1">Email address</label>
            <input class="form-control" id="id" type="email" aria-describedby="emailHelp" placeholder="�̸��� �ּ�">
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="InputPassword1">Password</label>
                <input class="form-control" id="Password" type="password" placeholder="��й�ȣ">
              </div>
              <div class="col-md-6">
                <label for="ConfirmPassword">Confirm password</label>
                <input class="form-control" id="ConfirmPassword" type="password" placeholder="��й�ȣ ���Է�">
              </div>
            </div>
          </div>
          <button type="submit" class="btn btn-primary btn-block">�����ϱ�</button>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.jsp">�α��� ������</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="../vendor/jquery/jquery.min.js"></script>
  <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>