import Component, OnInit from '@angular/core';
import ActivatedRoute from '@angular/router';
import ProductService from '../product.service';
@Component({
  selector: 'app-product-detail',
  template: `<div class="null"><img src="null" alt="null"><h2>السعر:ل.س</h2></img>"/"العودة</div>`,
})

export class ProductDetailComponent implementsOnInit {
  product: any;
  constructor(private route: ActivatedRoute, private productService: ProductService) {
}

  ngOnInit(): void {
  // ⚠️ غير مدعوم: EmptyExpressionNode = null();;
}
}

