import {Component} from '@angular/core';
import {FormGroup, FormControl, Validators }from '@angular/forms';
import {ProductService} from '../product.service';
import {Router} from '@angular/router';
@Component({
  selector: 'app-product-add'
})

export class AddproductfaildComponent {
  productForm = new FormGroup({
    name: new FormControl('', [,, Validators.required]),
    price: new FormControl('', [,, [Validators.required,Validators.min(0)]]),
    details: new FormControl('', []),
    image: new FormControl('', []),
  });
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

