package com.ecom.service.implimentation;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.ecom.dto.Customer;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface CustomerService {

	String loadRegister(ModelMap map);

	String loadRegister(@Valid Customer customer, BindingResult result, HttpSession session);

	String submitOtp(int id, int otp, HttpSession session);

	String viewProducts(HttpSession session, ModelMap map);

	String loadHome(HttpSession session);

	String addToCart(HttpSession session, int id);

    String resendOtp(int id, HttpSession session);

	String viewCart(HttpSession session, ModelMap map);

	String checkout(HttpSession session, ModelMap map);

	String confirmOrder(HttpSession session, int id, String razorpay_payment_id);

	String viewOrders(HttpSession session, ModelMap map);

	String removeFromCart(HttpSession session, int id);

	String addToCartItem(HttpSession session, int id);

	String removeFromCartItem(HttpSession session, int id);

}
