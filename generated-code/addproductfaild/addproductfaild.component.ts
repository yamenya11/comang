import Component from '@angular/core';
import FormGroup, FormControl, Validators from '@angular/forms';
import ProductService from '../product.service';
import Router from '@angular/router';
@Component({
  selector: 'app-product-add',
  template: `<form formGroup="null" (ngSubmit)="null"><div class="null"><label>اسمالمنتج"text""name""form-control""اسم المنتج"<div class="null"><label>السعر"number""price""form-control""السعر"التفاصيل</label>"details""form-control""التفاصيل"</div>رابطالصورة</label>"text""image""form-control""رابط الصورة"</div>"submit""btn btn-primary"حفظ</form>`,
})

export class ProductAddComponent {
  productForm = new FormGroup({
    name: new FormControl('''', [[,, Validators.required]]),
    price: new FormControl('''', [[,, [Validators.required,Validators.min(0)]]]),
    details: new FormControl('''', []),
    image: new FormControl('''', []),
  });
  constructor(private productService: ProductService, private router: Router) {
}

  constructor(private productService: ProductService, private router: Router) {
}

  addProduct() {
  if (this.productForm.valid) {
    this.productService.addProduct(this.productForm.value)
      .subscribe(() => {
        this.router.navigate(['/products']);
      });
  }
}

}

