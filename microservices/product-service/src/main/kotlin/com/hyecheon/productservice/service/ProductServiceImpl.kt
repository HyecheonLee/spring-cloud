package com.hyecheon.productservice.service

import com.hyecheon.api.product.Product
import com.hyecheon.api.product.ProductService
import com.hyecheon.util.http.ServiceUtil
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductServiceImpl(
		val serviceUtil: ServiceUtil) : ProductService {
	override fun getProduct(productId: Int): Product {
		return Product(productId, "name-${productId}", 123, serviceUtil.serviceAddress!!)
	}
}