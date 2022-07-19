package laura.com.cnp.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import laura.com.cnp.dao.CouponDAO;
import laura.com.cnp.model.Coupon;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

/**
 * Servlet implementation class CouponController
 */
@WebServlet("/coupons")
public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CouponDAO dao = new CouponDAO();
	public CouponController() {
		super();
	}

	// tomando los valores del input del html y colocandolos en la base de datos
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("create")) {
			createCoupon(request, response);
		}else if(action.equals("find")){
			findCoupon(request, response);
		}
		

	}

	private void createCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("couponCode");
		String discount = request.getParameter("discount");
		String expiryDate = request.getParameter("expiryDate");
		Coupon coupon = new Coupon();
		coupon.setCode(couponCode);
		coupon.setDiscount(new BigDecimal(discount));
		coupon.setExpDate(expiryDate);
		//guardandolo en la base de datos
		dao.save(coupon);
		
		//respuesta diciendo que el producto se creo
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Coupon created<br/>");
		out.print("<br/><a href='/candpapp'>Home</a>");
	}
	
	public void findCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("couponCode");
		Coupon coupon = dao.findByCode(couponCode);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(coupon);
		out.print("<br/><a href='/candpapp'>Home</a>");
	}

}
