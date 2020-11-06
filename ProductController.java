package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDao;
import com.example.model.Product;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private ProductDao pd = new ProductDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String opt = req.getParameter("opt");
		if (opt != null) {
			int choice = Integer.parseInt(opt);

			switch (choice) {
			case 1:
				insert(req, resp);
				break;
			case 2:
				delete(req, resp);
				break;
			case 3:
				update(req, resp);
				break;
			case 4:
				fetchByCategory(req, resp);
				break;
			}
		}
	}

	private void fetchByCategory(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cat=req.getParameter("cat");
		List<Product> products=pd.fetchByCategory(cat);
		req.getServletContext().setAttribute("list", products);
		resp.sendRedirect("showdata.jsp");

	}

	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cat = req.getParameter("cat");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String date = req.getParameter("date");

		Product p = new Product();
		p.setCategory(cat);
		p.setName(name);
		p.setPrice(Float.parseFloat(price));
		p.setDates(date);

		if (pd.insert(p) > 0) {
			resp.getWriter().print("Successfully Insert");
			req.getRequestDispatcher("index.jsp").include(req, resp);
		} else {
			resp.getWriter().print("Insert Fail");
			req.getRequestDispatcher("index.jsp").include(req, resp);
		}

	}

}
