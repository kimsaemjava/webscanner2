<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="EUC-KR">
<!-- �ΰ����� �׸� -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<title>CSS Tips</title>
<style>
.jbTable {
	display: table;
	width: 100%;
}

.jbTableRow {
	display: table-row;
}

.jbTableCell {
	display: table-cell;
}

.jbText {
	width: 100%;
}

.jbSubmit {
	width: 1%;
}

.jbText input {
	width: 100%;
}
</style>
</head>
<body>
	<h3>��ü�˻�</h3>
	<p class="lead">
		��ü�˻縦 ������ URL�� �Է����ּ���. <br />
	</p>
	<hr class="my-4">
	<div class="jbTable">
		<div class="jbTableRow">
			<div class="jbTableCell jbText">
				<div>
					<div class="cols-md-8">
						<input type="url" placeholder="url���Ŀ� �°� �Է� �ٶ��ϴ�.">
					</div>
					<div class="cols-md-4">
						<button class="btn btn-success btn pull-right" type="button">START</button>
						<button class="btn btn-danger btn pull-right" type="button">STOP</button>
					</div>
				</div>
				<div class="jbTableCell jbSubmit"></div>
			</div>
		</div>
	</div>
	<div class="form-group">
		<p>�����Ȳ</p>
		<div class="progress">
			<div class="progress-bar progress-bar-striped progress-bar-animated"
				role="progressbar" aria-valuenow="75" aria-valuemin="0"
				aria-valuemax="100" style="width: 75%"></div>
		</div>
		<textarea class="form-control" id="exampleTextarea" rows="10">
                ��ü �˻� ����(10:00 ���)
                ������ ����� ������.....
                ������ ����� ���� �Ϸ�(02:00)
                
                ���� �˻�����
                ����� ���� ������.....
                ����� ���� ���� �Ϸ�(05:00)
                 ......
                ��ü �˻� �Ϸ�(�� 15:00)
      </textarea>
	</div>
	<br />
	<br />
</body>
</html>