<%@page import="com.onnorokomsms.api.SendSmsSoap"%>
<%@page import="com.onnorokomsms.api.SendSms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OnnorokomSms</title>
    </head>
    <body>

        <h1>SMS Testing Project!</h1>

        <%
            SendSms sms = new SendSms();
            SendSmsSoap port = sms.getSendSmsSoap();
            String userName = "your_user_name";
            String password = "your_password";
            String mobileNumber = "your_mobile_number";
            String smsBody = "This is a test sms";
            String maskName = "your_DemoMask";
            String campaignName = "your_Campaign_name";
            String returnValue;
            String status = null;
            
            
            try{
                
                 returnValue = port.oneToOne(userName, password, mobileNumber, smsBody, "TEXT", maskName, campaignName);
                 
                 //Developer can use this "returnValue" for further logging/monitoring purpose
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        %>
    </body>
</html>
