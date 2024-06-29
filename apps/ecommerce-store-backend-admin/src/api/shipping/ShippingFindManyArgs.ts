import { ShippingWhereInput } from "./ShippingWhereInput";
import { ShippingOrderByInput } from "./ShippingOrderByInput";

export type ShippingFindManyArgs = {
  where?: ShippingWhereInput;
  orderBy?: Array<ShippingOrderByInput>;
  skip?: number;
  take?: number;
};
