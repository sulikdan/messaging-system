export class CustomerModel {

  id: string;//UUID TODO later

  firstName:string;
  lastName:string;

  email: string;

  // fix dodo
  shopOrderList: any[];

  cartList: any[];

  createdAt: string;
  updatedAt: string


  constructor(id: string, firstName: string, lastName: string, email: string, shopOrderList: any[], cartList: any[], createdAt: string, updatedAt: string) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.shopOrderList = shopOrderList;
    this.cartList = cartList;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
}
