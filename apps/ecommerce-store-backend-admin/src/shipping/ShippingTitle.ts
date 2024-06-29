import { Shipping as TShipping } from "../api/shipping/Shipping";

export const SHIPPING_TITLE_FIELD = "id";

export const ShippingTitle = (record: TShipping): string => {
  return record.id?.toString() || String(record.id);
};
