package laura.com.cnp.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import laura.com.cnp.dao.CouponDAO;
import laura.com.cnp.dao.ProductDAO;
import laura.com.cnp.model.Coupon;
import laura.com.cnp.model.Product;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/products")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CouponDAO couponDAO = new CouponDAO();
	ProductDAO productDAO = new ProductDAO();

	public ProductController() {
		super();
	}

//obtiene la informacion del producto, toma el codigo de descuento, 
	//aplica el descuento, guarda el producto y manda la respuesta
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String couponCode = request.getParameter("couponCode");
		Coupon coupon = couponDAO.findByCode(couponCode);

		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));

		productDAO.save(product);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Product created<br/>");
		out.print("<br/><a href='/candpapp'>Home</a>");
	}

}
