package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PictureServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=utf-8");
		// 클라이언트에게 문자열을 출력할 수 있는 객체 얻어오기
		PrintWriter pw = response.getWriter();//출력하면 클라이언트에게 보여줌
		pw.println("<doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>오늘의 사진</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>오늘의 사진</h3>");
		pw.print("<img src='/Step01_Servlet/images/j1.jpg'>");//절대
		pw.print("<img src='../images/0.png'>");//상대
		pw.println("</body>");
		pw.println("</html>");
	}
}
