import { ProductCategory } from "./product-category";

export class Product {

      sku:String;
      name:String;
      description:String;
      unitPrice:number;
      imageUrl:String;
      active:boolean;
      unitsInStock:number;
      dateCreated:Date;
      lastUpdated:Date;
      category: ProductCategory;
}
