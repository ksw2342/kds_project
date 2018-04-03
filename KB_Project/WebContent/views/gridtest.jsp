<%@page import="org.json.JSONStringer"%>
<%@page import="com.kbdata.jjh.dao.UserDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" media="screen" href="../css/ui.jqgrid.css" />
<script src="../js/jquery-1.7.2min.js" type="text/javascript"/>
<script src="../js/i18n/grid.locale-kr.js" type="text/javascript"/>
<script src="../js/jquery.jqGrid.min.js" type="text/javascript"/> 



</head>
<body>
    
    <%String js1 = "${listUser}";
    System.out.println(js1);
    %>
    
<script type="text/javascript">
//jqGrid 테이블

$(document).ready(function(){
	jQuery("#list").jqGrid({
	url: local,
    datatype: 'json',
    colNames:['u_id',
    		  'id',
              ﻿'name'﻿,
              ﻿'phone'﻿,
              ﻿'regi_date'﻿,
              ﻿'card_num'﻿,
              ﻿'point'﻿﻿],
    colModel:[
        // 서버단에서 작업한 Json 객체의 key값으로 컬럼값을 설정해주면 자동 읽어들임.
        {name:'u_id',     index:'u_id',  width:"120"},
        {name:'id',    index:'id',       width:"80"},              
        {name:'name',    index:'name',    width:"80" },
        {name:'phone',         index:'phone',width:"120" },
        {name:'regi_date',         index:'regi_date',         width:"100"},
        {name:'card_num',         index:'card_num',          width:"120"},
        {name:'point',          index:'point',        width:"110"}
        ],
    rowNum:      10,
    autowidth:   true,
    sortname:    'u_id',
    gridview:    true,
    multiselect: true,
    sortable:    true,
    height:      "auto"
    });
	
	
    var mydata = eval('<%=js1%>');
  	for(var j=0;j<=mydata.length;j++){
  		jQuery("#list").addRowData(j+1,mydata[j]);
  	}
    //jsonReader : { repeatitems: false },
  
});
</script>
	<table id="list" class="scroll" width="1000"></table>
</body>
</html>